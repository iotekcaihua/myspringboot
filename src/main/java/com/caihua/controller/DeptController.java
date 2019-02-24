package com.caihua.controller;

import com.caihua.bean.Dept;
import com.caihua.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("findDeptById")
    public String findDeptById(int did,Model model){
        Dept dept=deptService.findDeptById(did);
        model.addAttribute("dept",dept);
        return "dept";
    }

    @RequestMapping("findDeptByName")
    public String findDeptByName(HttpServletRequest req, String dname, Model model){
        System.out.println(deptService);
        Dept dept=deptService.findDeptByName(dname);
        model.addAttribute("dept",dept);
        return "forward:/WEB-INF/dept.jsp";
    }
}
