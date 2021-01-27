package com.bjsxt.wsk.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {
    /**
     * 页面跳转
     * @param page
     * @return
     * @PathVariable 获取路径资源
     */
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
