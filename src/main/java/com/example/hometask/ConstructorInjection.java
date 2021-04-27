package com.example.hometask;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    private Example example;

    public ConstructorInjection(Example example) {
        this.example = example;
    }

    public Example getExample() {
        return example;
    }
}
