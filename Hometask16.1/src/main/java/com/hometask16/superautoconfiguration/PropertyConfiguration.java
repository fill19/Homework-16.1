package com.hometask16.superautoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "custom.configuration.enabled", havingValue = "true")
public class PropertyConfiguration {
    public PropertyConfiguration() {
        System.out.println("AutoConfigurationOnProperty was created properly ;) 0_0");
    }
}