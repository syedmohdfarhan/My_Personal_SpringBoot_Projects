package com.codingshuttle.anuj.module1Introduction.impl;

import com.codingshuttle.anuj.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
@Qualifier("SMSNotif")
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS sending.." + message);

    }
}
