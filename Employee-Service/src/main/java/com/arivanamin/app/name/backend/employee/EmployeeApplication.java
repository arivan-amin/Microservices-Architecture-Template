package com.arivanamin.app.name.backend.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import static com.arivanamin.app.name.backend.core.domain.base.CoreApplicationConfig.BASE_PACKAGE;

@SpringBootApplication (scanBasePackages = BASE_PACKAGE)
@EnableDiscoveryClient
@EnableCaching
public class EmployeeApplication {
    
    public static void main (String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }
}
