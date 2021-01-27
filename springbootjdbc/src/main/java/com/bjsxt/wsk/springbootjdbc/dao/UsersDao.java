package com.bjsxt.wsk.springbootjdbc.dao;

import com.bjsxt.wsk.springbootjdbc.pojo.Users;

import java.util.List;

public interface UsersDao {
    void insertUser(Users users);
    List<Users> selectUserAll();
    Users selectUserById(Integer id);
    void updateUser(Users users);
    void deleteUserById(Integer id);
}
