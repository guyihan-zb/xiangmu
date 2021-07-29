package com.example.usermanager.config;

import com.example.usermanager.tools.AppFinal;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-07-29
 * @time: 10:54
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if(session!=null && session.getAttribute(AppFinal.USERINFO_SESSION_KEY)!=null){
            //登陆状态
            return true;
        }
        return false;
    }
}
