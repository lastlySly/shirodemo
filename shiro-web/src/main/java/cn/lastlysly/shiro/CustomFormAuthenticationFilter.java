package cn.lastlysly.shiro;

import cn.lastlysly.controller.AjaxUtilsTest;
import cn.lastlysly.myutils.MyUtils;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomFormAuthenticationFilter extends FormAuthenticationFilter{

    private static final Logger logger = LoggerFactory
            .getLogger(CustomFormAuthenticationFilter.class);

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
//        return super.onAccessDenied(request, response, mappedValue);
        if(this.isLoginRequest(request, response)) {
            if(this.isLoginSubmission(request, response)) {
                logger.info("Login submission detected.  Attempting to execute login.");

                return this.executeLogin(request, response);
            } else {
                logger.info("Login page view.");

                return true;
            }
        } else {
            logger.info("Attempting to access a path which requires authentication.  Forwarding to the Authentication url [" + this.getLoginUrl() + "]");

            HttpServletRequest httpRequest = WebUtils.toHttp(request);

            if (MyUtils.isAjax(httpRequest)) {

                HttpServletResponse httpServletResponse = WebUtils.toHttp(response);
//                httpServletResponse.sendError(401);
//                httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED);//401
                httpServletResponse.setContentType("text/html;charset=utf-8");
//                httpServletResponse.sendRedirect("/login.html");
                httpServletResponse.getWriter().write("这是自定义ajax shiro拦截，发送自定义输出，");
                return false;

            } else {
                //  saveRequestAndRedirectToLogin(request, response);
                redirectToLogin(request, response);
            }

            return false;
        }
    }
}