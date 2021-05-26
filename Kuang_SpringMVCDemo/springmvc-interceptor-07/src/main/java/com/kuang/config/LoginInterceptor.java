package com.kuang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-18:13
 */

public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        //去登录页面可以放行
        if(request.getRequestURI().contains("goLogin")){
            return true;
        }
        //在登录页面可以放行
        if(request.getRequestURI().contains("login")){
            return true;
        }

        //有session 登录过, 放行
        if(session.getAttribute("userLoginInfo")!=null){
            return true;
        }

        //其他情况, 不放行, 跳转取登录页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
