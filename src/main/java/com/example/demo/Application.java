package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableReactiveMongoRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
