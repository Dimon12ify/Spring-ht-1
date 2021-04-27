package com.example.hometask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

@Component
public class Example {

    public Example() {

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
