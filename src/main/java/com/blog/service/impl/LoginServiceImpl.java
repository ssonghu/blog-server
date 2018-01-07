package com.blog.service.impl;

import com.blog.dao.LoginDao;
import com.blog.domain.BlogUsers;
import com.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginDao dao;

    @Override
    public BlogUsers findByUserNameAndPassword(String userName, String passWord) {
        return dao.findByUsernameAndPassword(userName,passWord);
    }
}
