package com.jike.controller;

import com.jike.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PathvariableController {

    @ResponseBody
    @RequestMapping("/pathvariable/{username}")
    public User test1(@PathVariable String username){
        User user = new User();
        user.setUserName(username);
        return user;
    }
    @ResponseBody
    @RequestMapping("/pathvariable2/{intval}")
    public User test2(@PathVariable Integer intval){
        User user = new User();
        user.setUserName(intval+"");
        return user;
    }

}
