package cn.lastlysly.service;

import cn.lastlysly.pojo.TestUsers;

import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-05 18:27
 **/
public interface UserService {

    TestUsers getUserByUserName(String userName);

    List<String> queryRolesByUserName(String userName);

    List<String> queryPermissionsByUserName(String userName);
}
