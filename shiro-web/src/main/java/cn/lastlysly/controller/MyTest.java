package cn.lastlysly.controller;

import cn.lastlysly.pojo.TestPermission;
import cn.lastlysly.pojo.TestUsers;
import cn.lastlysly.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-05 19:14
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class MyTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        TestUsers testUsers = userService.getUserByUserName("lastly");
        System.out.println(testUsers.getTestPassword());
    }

    @Test
    public void test2(){
        List<String> testPermission = userService.queryPermissionsByUserName("lastly");
        for (String te : testPermission){
            System.out.println("lastly拥有权限：" + te);
        }
    }

}
