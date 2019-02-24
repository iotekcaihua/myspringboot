package com.caihua.controller;

import com.alibaba.fastjson.JSON;
import com.caihua.bean.Employee;
import com.caihua.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("findEmp")
    public String findEmp(int eid, HttpServletRequest request, Model model) {
        Employee employee = empService.findEmp(eid);
        model.addAttribute("employee", employee);
        String clientIP=request.getHeader("X-real-ip");
        String clientIP2=request.getHeader("X-Forwarded-For");
        String host=request.getHeader("Host");
        System.out.println(clientIP);
        System.out.println(clientIP2);
        System.out.println(host);
        return "employee";
    }

    @RequestMapping("find")
    @ResponseBody
    public String find(HttpServletRequest request, int eid) {
        String jsonp = request.getParameter("jsonpcallback");
        Employee employee = empService.findEmp(eid);
        System.out.println(jsonp + "(" + JSON.toJSONString(employee) + ")");
        return jsonp + "(" + JSON.toJSONString(employee) + ")";
    }

}
