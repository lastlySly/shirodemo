package cn.lastlysly.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;


/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-02 12:14
 **/
public class IniRealmTest {

    @Test
    public void testAuthenticationByIniRealm(){

        IniRealm iniRealm = new IniRealm("classpath:user.ini");

        //构建SecurityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(iniRealm);

        //主题提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("lastly","123456");
        subject.login(token);

        System.out.println("isAuthentication(是否已认证):" + subject.isAuthenticated());

        subject.checkRoles("admin","user");//没报错即为正确

        subject.checkPermissions("user:delete","user:update");//没报错即为正确



    }

}
