package com.bjsxt.wsk.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/page")
    public String showPage() {
        return "/index.html";
    }
}
