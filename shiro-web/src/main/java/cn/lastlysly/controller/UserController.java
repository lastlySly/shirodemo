package cn.lastlysly.controller;

import cn.lastlysly.pojo.UserSheet;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-03 13:09
 **/
@Controller
public class UserController {

    @RequestMapping(value = "/subLogin" ,method = RequestMethod.POST,
    produces = "application/json;charset=utf-8")
    @ResponseBody
    public String subLogin(UserSheet userSheet){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userSheet.getUsername(),userSheet.getPassword());

        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            return e.getMessage();
        }
        if (subject.hasRole("admin")){

            if (subject.isPermitted("user:delete")){
                return "登陆成功，是admin角色,有user:delete权限";
            }
            return "登陆成功，是admin角色,没有user:delete权限";

        }else{
            return "登陆成功,不是admin角色";
        }

    }

    @RequestMapping(value = "/ajaxlogin",method = RequestMethod.POST)
    @ResponseBody
    public String ajaxlogin(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + "==" + password);
        return username + "==" + password;
    }


    /**
     * 注解授权demo
     * @return
     */
    @RequiresRoles("admin")
    @RequestMapping(value = "/testRole",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String testRole(){
        return "testRole测试，，注解授权，@RequiresRoles(\"admin\")，有指定角色的用户方可访问";
    }

    /**
     * 注解授权demo
     * @return
     */
    @RequiresPermissions("user:delete")
    @RequestMapping(value = "/testPermission",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String testPermission(){
        return "testPermission测试，，注解授权，@RequiresPermissions(\"user:delete\")有指定权限的用户方可访问";
    }

}
