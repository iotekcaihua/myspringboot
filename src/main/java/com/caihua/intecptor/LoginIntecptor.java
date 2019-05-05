package com.caihua.intecptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Slf4j
public class LoginIntecptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object userName = session.getAttribute("userName");
        if (userName == null) {
            log.error("还未登录，重新发送请求到index.jsp");
            session.setAttribute("userName","yes");
            response.sendRedirect("/index.jsp");
            //这一步都是执行return true后才会执行，后面返回的view覆盖了第一次的view
            //response.sendRedirect("/user/addUser?name=222&age=33&birth=2013-02-03");
            //request.getRequestDispatcher("/user/addUser?name=222&age=33&birth=2013-02-03").forward(request,response);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
    }
}
