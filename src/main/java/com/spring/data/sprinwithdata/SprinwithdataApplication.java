package com.spring.data.sprinwithdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;

@SpringBootApplication
@Async
public class SprinwithdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinwithdataApplication.class, args);
    }
}
