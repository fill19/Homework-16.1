package com.hometask16.superautoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingClass("com.hometask16.superautoconfiguration.MyConfiguration")
public class MyAutoConfigurationOnMissingClass {

    @Bean
    @ConditionalOnMissingBean
    public AutoConfService chicks() {
        System.out.println("It`s common bean created from class AutoConfiguration ");
        return new AutoConfServiceImpl();
    }
}
