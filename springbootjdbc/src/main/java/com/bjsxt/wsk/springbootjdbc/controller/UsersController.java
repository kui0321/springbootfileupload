package com.bjsxt.wsk.springbootjdbc.controller;


import com.bjsxt.wsk.springbootjdbc.pojo.Users;
import com.bjsxt.wsk.springbootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UserService usersService;
    /**
     * 添加用户
     * @return
     */
    @PostMapping("/addUser")
    public String addUser(Users users){
        try{
            this.usersService.addUser(users);
        }catch(Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    /**
     * 查询全部用户
     * @param model
     * @return
     */
    @GetMapping("/findUserAll")
    public String finUserAll(Model model){
        List<Users> list = null;
        try{
            list = this.usersService.findUserAll();
            model.addAttribute("list",list);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "showUser";
    }

    /**
     * 预更新操作
     * @param id
     * @param model
     * @return
     */
    @GetMapping("preUpdateUser")
    public String preUpdateUser(Integer id, Model model){
        try {
            Users users = this.usersService.findUserById(id);
            model.addAttribute("users",users);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "updateUser";
    }

    /**
     * 修改用户信息
     * @param users
     * @return
     */
    @PostMapping("updateUser")
    public String updateUser(Users users){
        try{
            this.usersService.modifyUser(users);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    @GetMapping("deleteUser")
    public String deleteUser(Integer id){
        try{
            this.usersService.dropUser(id);
        }catch(Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }
}
