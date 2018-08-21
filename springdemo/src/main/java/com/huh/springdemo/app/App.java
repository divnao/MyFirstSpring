package com.huh.springdemo.app;

import com.huh.springdemo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        WelcomeService welcomeService = (WelcomeService) ac.getBean("welcomeService");
        welcomeService.sayHello();
    }
}
