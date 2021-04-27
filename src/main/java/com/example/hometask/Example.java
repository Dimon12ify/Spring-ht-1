package com.example.hometask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Example {

    public Example() {}

    @PostConstruct
    public void created() {
        System.out.println(">>>>>>>> BEAN SUCCESSFULLY CREATED");
    }

    @PreDestroy
    public void destroyed() {
        System.out.println(">>>>>>>>> BEAN WILL BE DESTROYED NOW");
    }

    public String Hello() {
        return "Hello";
    }

    public String World() {
        return "World";
    }

    public String Spring() {
        return "SKB <3 + SPRING";
    }
}
