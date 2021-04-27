package com.example.hometask;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("flames2")
public class Flames2 implements IFlames {
    @Override
    public String example() {
        return "SECOND";
    }

    @PostConstruct
    public void created() {
        System.out.println(">>>>> BEAN 2 SUCCESSFULLY CREATED");
    }
}
