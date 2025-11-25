package com.codingshuttle.anuj.module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentService pS(){
        //more logic before bean formation
        return new PaymentService();
    }
}
