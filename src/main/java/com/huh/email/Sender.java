package com.huh.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("mailSender")
public class Sender {

    @Autowired
    private ApplicationContext applicationContext;

    public void sendMail(String receiver){
        System.out.println("Sender: sending an email to: " + receiver);
        try{
            MailSendEvent event = new MailSendEvent(applicationContext, receiver);
            applicationContext.publishEvent(event);
            System.out.println("Sender: Email sent success.");
        } catch (Exception e) {
            System.out.println("Sender: Email sent failed!!");
        }

    }
}