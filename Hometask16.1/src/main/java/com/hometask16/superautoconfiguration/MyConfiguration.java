package com.hometask16.superautoconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hometask16")
public class MyConfiguration {
    public MyConfiguration() {
        System.out.println("Auto configuration is done");
    }
}
