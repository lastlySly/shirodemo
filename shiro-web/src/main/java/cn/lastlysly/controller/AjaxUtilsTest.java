package cn.lastlysly.controller;

import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-17 13:59
 **/
public class AjaxUtilsTest {

    @ResponseBody
    public static String ajaxResult(){
        return "测试自定义shiro ajax拦截器能否调用带@ResponseBody的输出方法";
    }

}
