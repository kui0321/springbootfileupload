package com.bjsxt.wsk.springbootfreemarker.controller;

import com.bjsxt.wsk.springbootfreemarker.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {
//    处理请求返回数据
    @GetMapping("/showUsers")
    public String showUsers(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users("admin", "F", "23"));
        list.add(new Users("lise", "F", "11"));
        list.add(new Users("tom", "M", "45"));
        model.addAttribute("list",list);
        return "userList";
    }
}
