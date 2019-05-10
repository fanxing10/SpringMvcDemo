package com.jike.dao;

import com.jike.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public User selectUserByUsername(String username) {

        //admin
        if ("admin".equals(username)){
            User user = new User();
            user.setPassword("123456");
            user.setUserName("admin");
            return user;
        }
        return null;
    }
}
