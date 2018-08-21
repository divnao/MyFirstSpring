package com.huh.springdemo.service;

import com.huh.springdemo.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Service("beanId"), 扫描此类,注入以"beanId"为id的bean到容器.
 * @Resource(name = "beanId2") 扫描此类,注入以"beanId2"为id的bean到容器.
 */
@Service("welcomeService")
public class WelcomeService {

    private String message = "hello spring";

    private UserDao dao;

    @Resource(name = "userDao")
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        dao.insert();
        System.out.println(message);
    }
}
