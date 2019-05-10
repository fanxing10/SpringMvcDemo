package com.jike.service;


import com.jike.bean.User;
import com.jike.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserDao userDao;

    public User doLogin(String username, String password) throws Exception {
        if (username == null || "".equals(username)){
            throw new Exception("用户名不能为空");
        }
        if (password == null || "".equals(password)){
            throw new Exception("密码不能为空");
        }

        User user  = userDao.selectUserByUsername(username);
        if (user == null ){
            throw new Exception("用户名不存在");
        }
        if (!(user.getPassword() .equals( password))){
            throw new Exception("密码错误");
        }
        return user;
    }
}
