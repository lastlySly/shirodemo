package cn.lastlysly.shiro.realm;

import cn.lastlysly.mapper.TestPermissionMapper;
import cn.lastlysly.mapper.TestRolesMapper;
import cn.lastlysly.mapper.TestUsersMapper;
import cn.lastlysly.pojo.TestUsers;
import cn.lastlysly.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-03 10:42
 * 自定义Realm
 **/
public class CustomRealm extends AuthorizingRealm {

//    Map<String,String> userMap = new HashMap<String, String>(16);
//    {
//        //e10adc3949ba59abbe56e057f20f883e  是密码123456用md5加密加盐后的，底部有转换代码
//        userMap.put("lastly","b15f77a07d5971fcfe6d33fe75bd6010");
//        super.setName("customRealm");
//    }
    @Autowired
    private UserService userService;


    /**
     * 授权
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        String userName = (String) principalCollection.getPrimaryPrincipal();
        //从数据库或者缓存中获取角色数据
        Set<String> roles = getRolesByUserName(userName);
        //从数据库或者缓存中获取权限数据
        Set<String> permissions = getPermissionsByUserName(userName);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setStringPermissions(permissions);
        simpleAuthorizationInfo.setRoles(roles);

        return simpleAuthorizationInfo;
    }

    /**
     * 从数据库获取权限数据
     * @param userName
     * @return
     */
    private Set<String> getPermissionsByUserName(String userName) {
        List<String> list = userService.queryPermissionsByUserName(userName);
        Set<String> permissionsSet = new HashSet<String>(list);
//        permissionsSet.add("user:delete");
//        permissionsSet.add("user:add");
        return permissionsSet;
    }

    /**
     * 从数据库获取角色数据
     * @param userName
     * @return
     */
    private Set<String> getRolesByUserName(String userName) {

        List<String> list = userService.queryRolesByUserName(userName);
        Set<String> rolesSet = new HashSet<String>(list);
//        rolesSet.add("admin");
//        rolesSet.add("user");
        return rolesSet;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //1，从主体传过来的的认证信息中，获取用户名
        String userName = (String) authenticationToken.getPrincipal();
        //2，通过用户名到数据库中获取凭证
        String password = getPasswordByUserName(userName);
        if (password == null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo
                (userName,password,"customRealm");
        //如果密码有加盐，则需要这个，传值为盐的码字，这里因为下面写死为"lastly"
        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(userName));
        return authenticationInfo;
    }

    /**
     * 从数据库查询凭证
     * @param userName
     * @return
     */
    private String getPasswordByUserName(String userName) {
        TestUsers testUsers = userService.getUserByUserName(userName);
        if (testUsers != null){
            return testUsers.getTestPassword();
        }
        return null;
    }



    //因为数据库存的是加密后的密码，这边先算出加密后的密码
    public static void main(String[] args) {
        //加盐一般使用随机数，这里写死
        Md5Hash md5Hash = new Md5Hash("123","abc");
        System.out.println(md5Hash.toString());
    }


}
