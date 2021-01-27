package com.bjsxt.wsk.springbootjdbc.service.impl;

import com.bjsxt.wsk.springbootjdbc.dao.UsersDao;
import com.bjsxt.wsk.springbootjdbc.pojo.Users;
import com.bjsxt.wsk.springbootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UserService {
    @Autowired
    private UsersDao usersDao;

    /**
     * 添加用户
     * @param users
     */
    @Override
    @Transactional
    public void addUser(Users users) {
        this.usersDao.insertUser(users);
    }

    /**
     * 查询全部用户
     * @return
     */
    @Override
    public List<Users> findUserAll() {
        return this.usersDao.selectUserAll();
    }

    /**
     * 预更新用户
     * @param id
     * @return
     */
    public Users findUserById(Integer id){
        return this.usersDao.selectUserById(id);
    }

    /**
     * 修改业务业务层
     * @param users
     */
    @Override
    @Transactional
    public void modifyUser(Users users) {
        this.usersDao.updateUser(users);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void dropUser(Integer id) {
        this.usersDao.deleteUserById(id);
    }
}
