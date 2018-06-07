package cn.lastlysly.service.serviceimpl;

import cn.lastlysly.mapper.TestPermissionMapper;
import cn.lastlysly.mapper.TestRolesMapper;
import cn.lastlysly.mapper.TestUsersMapper;
import cn.lastlysly.pojo.*;
import cn.lastlysly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-05 18:28
 **/
public class UserServiceImpl implements UserService {
    @Autowired
    private TestUsersMapper testUsersMapper;
    @Autowired
    private TestPermissionMapper testPermissionMapper;
    @Autowired
    private TestRolesMapper testRolesMapper;
    @Override
    public TestUsers getUserByUserName(String userName) {
        TestUsersExample testUsersExample = new TestUsersExample();
        TestUsersExample.Criteria criteria = testUsersExample.createCriteria();
        criteria.andTestUsernameEqualTo(userName);
        List<TestUsers> list = testUsersMapper.selectByExample(testUsersExample);
        return list.get(0);
    }

    @Override
    public List<String> queryRolesByUserName(String userName) {
        TestRolesExample testRolesExample = new TestRolesExample();
        TestRolesExample.Criteria criteria = testRolesExample.createCriteria();
        criteria.andTestRoleUsernameEqualTo(userName);
        List<TestRoles> list = testRolesMapper.selectByExample(testRolesExample);
        System.out.println(list.size());
        List<String> lis = new ArrayList<String>();
        if (list != null){
            for (TestRoles testRoles : list){
                System.out.println("======" + testRoles.getTestRoleName());
                lis.add(testRoles.getTestRoleName());
            }
        }

        return lis;
    }

    @Override
    public List<String> queryPermissionsByUserName(String userName) {

        List<String> permissionList = new ArrayList<String>();
        //通过用户名先获取该用户角色
        List<String> roles = queryRolesByUserName(userName);
        //通过角色名查询权限
        if (roles != null){
            TestPermissionExample testPermissionExample = new TestPermissionExample();
            TestPermissionExample.Criteria criteria = testPermissionExample.createCriteria();
            criteria.andTestPermissionRolenameIn(roles);
            List<TestPermission> permissions = testPermissionMapper.selectByExample(testPermissionExample);
            if (permissions != null){
                for (TestPermission testPermission : permissions){
                    permissionList.add(testPermission.getTestPermissionPermission());
                }
            }

        }

        return permissionList;
    }
}
