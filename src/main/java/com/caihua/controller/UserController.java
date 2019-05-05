package com.caihua.controller;

import com.caihua.bean.User;
import com.caihua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("addUser")
    public String addUser(User user, HttpServletRequest request, HttpServletResponse response) {
        userService.addUser(user);
        return "redirect:/success.html";
    }

    @RequestMapping("findUser")
    public String findUser(int id, Model model, HttpServletRequest request,HttpServletResponse response)  {
        User user = userService.findUser(id);
        model.addAttribute("user",user);
        return "showUser";
}

}

