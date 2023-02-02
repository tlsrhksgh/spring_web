package com.single.web.springboot2web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Springboot2WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2WebApplication.class, args);
    }

}
