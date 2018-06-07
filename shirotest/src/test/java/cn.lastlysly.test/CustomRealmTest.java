package cn.lastlysly.test;

import cn.lastlysly.shiro.realm.CustomRealm;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-03 11:13
 **/
public class CustomRealmTest {

    @Test
    public void customRealmTest(){
        //CustomRealm自定义的Realm
        CustomRealm customRealm = new CustomRealm();

        //1，构建SecurityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(customRealm);


        //加密
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
        matcher.setHashAlgorithmName("md5");//设置加密算法名称
        matcher.setHashIterations(1);//设置加密次数
        customRealm.setCredentialsMatcher(matcher);


        //2,主体提交认证凭证
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("lastly","1234567");
        subject.login(usernamePasswordToken);

        System.out.println("isAuthentication(是否已认证):" + subject.isAuthenticated());

        subject.checkRoles("admin","user");//没报错即为正确
        subject.checkPermissions("user:delete","user:add");
    }

}
