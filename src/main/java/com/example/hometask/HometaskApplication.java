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

    private static FieldInjection fieldInjection;
    private static IFlames flames;
    private static ConstructorInjection constructorInjection;
    private static SetterInjection setterInjection;

    public HometaskApplication(FieldInjection fieldInjection, @Qualifier("flames1") IFlames flames,
                               ConstructorInjection constructorInjection, SetterInjection setterInjection) {
        HometaskApplication.fieldInjection = fieldInjection;
        HometaskApplication.flames = flames;
        HometaskApplication.constructorInjection = constructorInjection;
        HometaskApplication.setterInjection = setterInjection;
    }

    public static void main(String[] args) {
        SpringApplication.run(HometaskApplication.class, args);
        System.out.println(flames.example());
        System.out.println(fieldInjection.getExample().Hello());
        System.out.println(constructorInjection.getExample().World());
        System.out.println(setterInjection.getExample().Spring());
    }
}
