package com.example.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class FieldInjection {
    @Autowired
    private Example example;

    public Example getExample() {
        return example;
    }
}
