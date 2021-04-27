package com.example.hometask;

import org.springframework.stereotype.Component;

@Component("flames1")
public class Flames1 implements IFlames {
    @Override
    public String example() {
        return "FIRST";
    }
}
