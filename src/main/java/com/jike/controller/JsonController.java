package com.jike.controller;

import com.jike.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {


    @ResponseBody
    @RequestMapping("/getJson")
    public User getUserInfo(){
        User user = new User();
        user.setUserName("zzx");
        user.setPassword("jsonTest");
        return user;
    }


}
