package com.bjsxt.wsk.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/show")
    public String showPage(Model model){
        model.addAttribute("msg", "Hello Thymeleaf");
        return "index";
    }
}
