package com.blog.dao;

import com.blog.domain.BlogUsers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LoginDao extends CrudRepository<BlogUsers,String>{

    BlogUsers findByUsernameAndPassword(String userName,String passWord);

    @Query("select b.createTime from BlogUsers as b")
    BlogUsers getAllBy();
}
