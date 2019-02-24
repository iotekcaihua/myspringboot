package com.caihua.controller;

import com.caihua.bean.Position;
import com.caihua.service.PositionService;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    public String findPosition(int pid,Model model){
        Position position=positionService.findPosition(pid);
        model.addAttribute("position",position);
        return "forward:position";
    }
}
