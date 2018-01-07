package com.blog.service;

import com.blog.domain.BlogUsers;

public interface LoginService {
    BlogUsers findByUserNameAndPassword(String userName, String passWord);
}
