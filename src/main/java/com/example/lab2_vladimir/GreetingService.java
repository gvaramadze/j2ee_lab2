package com.example.lab2_vladimir;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class GreetingService {

    public GreetingService() {
        System.out.println("GreetingService Constructor: Bean is being created.");
    }

    public String getGreeting() {
        return "Hello, Spring Beans!";
    }

    @PostConstruct
    public void init() {
        System.out.println("GreetingService @PostConstruct: Bean has been initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("GreetingService @PreDestroy: Bean is being destroyed.");
    }
}

