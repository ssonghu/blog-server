package com.blog.controller;

import com.blog.domain.BlogUsers;
import com.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService service;

    @RequestMapping("/login")
    public String Login(String username,String password){
        BlogUsers user = service.findByUserNameAndPassword(username,password);
        if(user!=null){
            return  user.toString();
        }else{
            return "没找到";
        }
    }
}
