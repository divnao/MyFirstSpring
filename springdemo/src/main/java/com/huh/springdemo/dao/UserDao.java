package com.huh.springdemo.dao;

import org.springframework.stereotype.Repository;

/**
 * @Repository("beanId") 扫描本类, 注入以beanId为Id的bean到容器.
 *
 */
@Repository("userDao")
public class UserDao {

    public void insert() {
        System.out.println("insert over.");
    }

}
