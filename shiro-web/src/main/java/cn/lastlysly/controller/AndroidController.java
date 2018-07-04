package cn.lastlysly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-08 16:21
 **/
@Controller
public class AndroidController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello(HttpServletRequest request, HttpServletResponse response){

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + "password:"+ password);

        return "我收到了HelloWorld";
    }
}
