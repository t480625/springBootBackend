package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan(basePackages="com.test")

public class Config extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
}
