package cn.lastlysly.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;


/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-02 12:03
 * shiro授权测试
 * SimpleAccountRealm不具备授权，这里仅演示,在自定义Realm里会有实例
 **/
public class AuthorizerTest {

    private SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void addUser(){
        simpleAccountRealm.addAccount("admin","123456","user","admin");
    }

    @Test
    public void testAuthorizer(){

        //构建SecurityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);

        //主题提交认证，授权
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("admin","123456");
        subject.login(token);
        System.out.println("(是否认证)isAuthentication:" + subject.isAuthenticated());

        subject.checkRoles("admin","user");



    }

}
