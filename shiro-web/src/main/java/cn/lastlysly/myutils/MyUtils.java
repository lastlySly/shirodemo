package cn.lastlysly.myutils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-05 12:22
 **/
public class MyUtils {
    public static boolean isAjax(HttpServletRequest request){
//        if (request.getHeader("X-Requested-With") != null &&
//                "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString())){
//            return true;
//        }
//        return false;

        return (request.getHeader("X-Requested-With") != null &&
                "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
    }
}
