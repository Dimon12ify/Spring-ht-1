package com.example.hometask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.hometask")
public class SampleConfig {
    @Bean
    public Example example() {
        return new Example();
    }

    @Bean
    public FieldInjection fieldInjection() {
        return new FieldInjection();
    }
}
