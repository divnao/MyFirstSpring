package com.huh.springmybatis.test;

import com.huh.springmybatis.domain.User;
import com.huh.springmybatis.service.UserService;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestCurd {

    /**
     * test c3p0 data source in spring configuration is available.
     */
    @Test
    public void getConn() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource) ac.getBean("combopooledDataSource");
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void testUserService() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) ac.getBean("userService");
        User u = new User();
        u.setName("Tomas");
        u.setAge(52);
        userService.insert(u);
    }

}
