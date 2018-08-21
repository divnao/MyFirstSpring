package com.huh.email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  test email
 *
 * @author huh
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("email.xml");
        Sender sender = (Sender)ac.getBean("sender");
        sender.sendMail("Tom");
        ((ClassPathXmlApplicationContext) ac).registerShutdownHook();
    }
}
