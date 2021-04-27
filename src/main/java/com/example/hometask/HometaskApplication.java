package com.example.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Configuration
public class HometaskApplication {

    @Autowired
    private static FieldInjection fieldInjection;
    @Autowired
    private static ConstructorInjection constructorInjection;
    @Autowired
    private static SetterInjection setterInjection;

    @Autowired
    @Qualifier("flames1")
    private static IFlames flames;

    public static void main(String[] args) {
        SpringApplication.run(HometaskApplication.class, args);
        System.out.println(flames.example());
        System.out.println(fieldInjection.getExample().Hello());
        System.out.println(constructorInjection.getExample().World());
        System.out.println(setterInjection.getExample().Spring());
    }
}
