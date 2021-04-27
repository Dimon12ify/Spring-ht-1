package com.example.hometask;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("flames1")
public class Flames1 implements IFlames {
    @Override
    public String example() {
        return "FIRST";
    }

    @PostConstruct
    public void created() {
        System.out.println(">>>>> BEAN 1 SUCCESSFULLY CREATED");
    }
}
