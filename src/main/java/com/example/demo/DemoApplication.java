package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 5;
        System.out.println(a+4);
        System.out.println("Smth new");
        SpringApplication.run(DemoApplication.class, args);
    }

}
