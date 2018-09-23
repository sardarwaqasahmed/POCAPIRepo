package com.search.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.search.api.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class NyTimesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NyTimesApiApplication.class, args);
    }
}
