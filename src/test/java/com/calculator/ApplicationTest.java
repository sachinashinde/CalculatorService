package com.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

/**
 * Created by sachin on 4/4/2017.
 */
@SpringBootConfiguration
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        logger.info("Welcome to spring boot demo app");
        SpringApplication.run(Application.class, args);

        
    }
}
