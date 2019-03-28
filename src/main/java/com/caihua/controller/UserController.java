package com.caihua.controller;

import com.caihua.bean.User;
import com.caihua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/success.html";
    }

}
