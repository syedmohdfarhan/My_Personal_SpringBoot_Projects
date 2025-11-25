package com.codingshuttle.anuj.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
@Service
public class PaymentService {
    public void pay(){
        System.out.println("Paying...");
    }
    @PostConstruct
    public void adterInit(){
        System.out.println("Before Paying...");
    }
    @PreDestroy
    public void beforeDestroy(){
        System.out.println("After payment...");
    }
}
