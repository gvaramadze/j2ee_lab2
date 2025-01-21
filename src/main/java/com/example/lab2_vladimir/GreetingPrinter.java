package com.example.lab2_vladimir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinter {

    private final GreetingService greetingService;

    @Autowired
    public GreetingPrinter(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("GreetingPrinter Constructor: Injected GreetingService.");
    }

    public void printGreeting() {
        System.out.println(greetingService.getGreeting());
    }
}

