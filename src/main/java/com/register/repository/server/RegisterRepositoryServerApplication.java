package com.register.repository.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.awt.*;
import java.awt.image.BufferedImage;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages = {"com.register.repository.server.domain.dao"})
@EntityScan(basePackages = {"com.register.repository.server.domain.model"})
@ComponentScan({"com.register.repository.server.domain.service"})
public class RegisterRepositoryServerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RegisterRepositoryServerApplication.class, args);
        System.out.println("\nRegister Repository Started With Successfully ....\n");
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RegisterRepositoryServerApplication.class);
    }
}
