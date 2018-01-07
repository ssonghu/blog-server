package com.blog.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {
    private static Log log = LogFactory.getLog(TestController.class);

    @RequestMapping("/get/{id}")
    public String getSomeThing(@PathVariable Long id) {
        HttpStatus httpStatus = null;
        httpStatus = HttpStatus.OK;
        log.info("收到请求,id:" + id);
        return "{\"id\":"+id+"}";
    }


}
