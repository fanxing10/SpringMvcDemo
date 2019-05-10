package com.jike.controller;


import com.jike.bean.User;
import com.jike.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("login")
    public String toLoginPage(){
        return "/WEB-INF/jsp/login.jsp";
    }

    @RequestMapping(value = "doLogin",method = RequestMethod.POST)
    public String doLogin(@RequestParam String username, @RequestParam String password, HttpServletRequest request, ModelMap map){

       try {
           User user =  userService.doLogin(username,password);
           map.put("user",user);
       }catch (Exception e){
            request.setAttribute("error",e.getMessage());
           return "/WEB-INF/jsp/login.jsp";
       }

        return "/WEB-INF/jsp/loginsuccess.jsp";
    }

    @RequestMapping("doLogout")
    public String soLogout(SessionStatus status){

        //清空session
        status.setComplete();
        return "/WEB-INF/jsp/login.jsp";
    }


}
