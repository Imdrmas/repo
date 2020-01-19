package com.register.repository.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.awt.*;
import java.awt.image.BufferedImage;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.register.repository.server.domain.dao"})
@EntityScan(basePackages = {"com.register.repository.server.domain.model"})
@ComponentScan({"com.register.repository.server.application.app", "com.register.repository.server.domain.service"})
public class RegisterRepositoryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterRepositoryServerApplication.class, args);
        System.out.println("\nRegister Repository Started With Successfully ....\n");
    }

}
