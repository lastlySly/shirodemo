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
 * @create 2018-06-02 11:44
 * shiro认证测试
 **/
public class AuthenticationTest {

    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void adduser(){
        simpleAccountRealm.addAccount("admin","123456");
    }

    @Test
    public void testAuthentication(){

        //1,构建SecurityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);

        //主体提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("admin","123456");

        subject.login(token);
        System.out.println("isAuthenticated(是否已认证):" + subject.isAuthenticated());

        subject.logout();
        System.out.println("isAuthenticated(是否已认证):" + subject.isAuthenticated());



    }
}
