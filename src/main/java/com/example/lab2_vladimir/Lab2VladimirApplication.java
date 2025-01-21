package com.example.lab2_vladimir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab2VladimirApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Lab2VladimirApplication.class, args);

		GreetingService greetingService1 = context.getBean(GreetingService.class);
		System.out.println(greetingService1.getGreeting());

		GreetingService greetingService2 = context.getBean(GreetingService.class);
		System.out.println("Comparing Beans: " + (greetingService1 == greetingService2));
	}
}
