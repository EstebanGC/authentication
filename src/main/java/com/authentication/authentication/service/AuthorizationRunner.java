package com.authentication.authentication.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthorizationRunner {
    public static void main(String[] args) {
        SpringApplication.run(AuthorizationRunner.class, args);
        System.out.println("Auth server started ..... ");
    }
}
