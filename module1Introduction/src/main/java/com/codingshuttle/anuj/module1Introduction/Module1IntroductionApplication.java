package com.codingshuttle.anuj.module1Introduction;

import com.codingshuttle.anuj.module1Introduction.impl.SMSNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {
//    @Autowired
//    PaymentService paymentService;
//	public static void main(String[] args) {
//
//        SpringApplication.run(Module1IntroductionApplication.class, args);
//        PaymentService obj = new PaymentService();
//        obj.pay();
//	}
//
//    @Override
//    public void run(String... args) throws Exception {
//        paymentService.pay();
//    }





   //@Autowired
    final NotificationService notificationService;// field dependency injection

    public Module1IntroductionApplication (@Qualifier("EmailNotif")NotificationService notificationService){
        this.notificationService= notificationService;// constructor dependency injection
    }
//args--> command line args
    public static void main(String[] args) {
        SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    Map<String,NotificationService> ns= new HashMap<>();

    @Override
    public void run(String... args) throws Exception {
        //tight coupling
        // NotificationService notificationService = new SMSNotificationService();
        //notificationService.send("hello sms");
        //loose coupling
        notificationService.send("hello");
        for (var ns : ns.entrySet()){
            System.out.println(ns.getKey());
            ns.getValue().send("Hello");
        }

      //  this.notificationService=null;
    }
}
