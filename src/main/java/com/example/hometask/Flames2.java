package com.example.hometask;

import org.springframework.stereotype.Component;

@Component("flames2")
public class Flames2 implements IFlames {
    @Override
    public String example() {
        return "SECOND";
    }
}
