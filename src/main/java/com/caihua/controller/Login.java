package com.caihua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class Login {
    @RequestMapping(value = "getConnCount",produces = "text/json;charset=utf-8")
    @ResponseBody
    public String getConn(HttpSession session){
        return String.valueOf(session.getServletContext().getAttribute("conn"));
    }
}
