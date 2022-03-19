package com.example.springbeanprop.config;

import com.example.springbeanprop.dto.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("tennis")
    @ConfigurationProperties(prefix = "person.tennis")
    @ConditionalOnProperty(prefix = "person.tennis", name = "name")
    Person tennis(){
        return Person.builder().build();
    }

    @Bean("cricket")
    @ConfigurationProperties(prefix = "person.cricket")
    @ConditionalOnProperty(prefix = "person.cricket", name = "name")
    Person cricket(){
        return Person.builder().build();
    }
}
