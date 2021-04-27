package com.example.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {
    private Example example;

    @Autowired
    public void setExample(Example example) {
        this.example = example;
    }

    public Example getExample() {
        return example;
    }
}
