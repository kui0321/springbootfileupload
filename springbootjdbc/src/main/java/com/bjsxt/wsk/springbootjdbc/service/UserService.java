package com.bjsxt.wsk.springbootjdbc.service;

import com.bjsxt.wsk.springbootjdbc.pojo.Users;
import java.util.List;

public interface UserService {
    void addUser(Users users);
    List<Users> findUserAll();
    Users findUserById(Integer id);
    void modifyUser(Users users);
    void dropUser(Integer id);
}
