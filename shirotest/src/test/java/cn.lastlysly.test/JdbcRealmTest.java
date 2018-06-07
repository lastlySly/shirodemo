package cn.lastlysly.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.cj.jdbc.Driver;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import java.sql.SQLException;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-02 12:39
 **/
public class JdbcRealmTest {

    /**
     * JdbcRealm默认的Sql语句，，如果没有自己写sql,则默认使用这几条
     *
     *     protected static final String DEFAULT_AUTHENTICATION_QUERY = "select password from users where username = ?";
     protected static final String DEFAULT_SALTED_AUTHENTICATION_QUERY = "select password, password_salt from users where username = ?";
     protected static final String DEFAULT_USER_ROLES_QUERY = "select role_name from user_roles where username = ?";
     protected static final String DEFAULT_PERMISSIONS_QUERY = "select permission from roles_permissions where role_name = ?";
     private static final Logger log = LoggerFactory.getLogger(JdbcRealm.class);
     protected DataSource dataSource;
     protected String authenticationQuery = "select password from users where username = ?";
     protected String userRolesQuery = "select role_name from user_roles where username = ?";
     protected String permissionsQuery = "select permission from roles_permissions where role_name = ?";
     protected boolean permissionsLookupEnabled = false;
     protected JdbcRealm.SaltStyle saltStyle;

     JdbcRealm默认的Sql语句，，如果没有自己写sql,则默认使用这几条

     */
    DruidDataSource dataSource = new DruidDataSource();

    {
        dataSource.setUrl("jdbc:mysql://localhost:3306/shiro_test?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }

    /**
     * 使用默认sql语句
     */
    @Test
    public void testAuthenticationByJdbcRealm(){
        //实例化JdbcRealm
        JdbcRealm jdbcRealm = new JdbcRealm();
        //引用数据源
        jdbcRealm.setDataSource(dataSource);
        //开启授权,默认为false
        jdbcRealm.setPermissionsLookupEnabled(true);

        //构架SecurityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(jdbcRealm);


        //主题提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("lastly","123456");
        subject.login(token);

        System.out.println("isAuthentication(是否已认证):" + subject.isAuthenticated());

        subject.checkRoles("admin","user");//没报错即为正确

//        subject.checkPermissions("user:delete","user:select");
        subject.checkPermissions("user:update","user:select");//没报错即为正确

    }

    /**
     * 使用自定义sql语句
     */
    @Test
    public void testCustomSqlJdbcRealm(){
        //实例化JdbcRealm
        JdbcRealm jdbcRealm = new JdbcRealm();
        //引用数据源
        jdbcRealm.setDataSource(dataSource);
        //开启授权,默认为false
        jdbcRealm.setPermissionsLookupEnabled(true);


        //自定义sql
        //用户认证
        String sql = "select test_password from test_users where test_username = ?";
        jdbcRealm.setAuthenticationQuery(sql);
        //角色
        String roleSql = "select test_role_name from test_roles where test_role_username = ?";
        jdbcRealm.setUserRolesQuery(roleSql);
        //权限
        String permissionSql = "select test_permission_permission from test_permission where test_permission_rolename = ?";
        jdbcRealm.setPermissionsQuery(permissionSql);

        //构架SecurityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(jdbcRealm);

        //主题提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("abc","123");
        subject.login(token);

        System.out.println("isAuthentication(是否已认证):" + subject.isAuthenticated());
        subject.checkRoles("admin");//没报错即为正确
        subject.checkPermissions("user:delete","uu");
    }

}
