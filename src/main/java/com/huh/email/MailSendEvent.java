package com.huh.email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * main event
 *
 * @author huh
 */
public class MailSendEvent extends ApplicationContextEvent {

    /**
     * email receiver.
     */
    private String receiver;

    public MailSendEvent(ApplicationContext source, String receiver) {
        super(source);
        this.receiver = receiver;
    }

    public String sendTo(){
        return this.receiver;
    }
}
