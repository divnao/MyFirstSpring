package com.huh.email;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * MailSendEvent listener.
 *
 * @author huh
 */
@Component
public class EmailListener implements ApplicationListener<MailSendEvent> {

    public void onApplicationEvent(MailSendEvent event) {
        MailSendEvent sendEvent = event;
        System.out.println("EmailListener: " + "a email send to: " + sendEvent.sendTo());
    }

}
