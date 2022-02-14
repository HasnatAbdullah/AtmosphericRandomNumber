package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtmosphericRandomNumberApplication implements CommandLineRunner {

    @Autowired Application application;

    public static void main(String[] args) {
        SpringApplication.run(AtmosphericRandomNumberApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        application.startApplication();
    }
}