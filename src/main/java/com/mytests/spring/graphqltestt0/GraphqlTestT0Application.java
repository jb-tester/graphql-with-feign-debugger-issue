package com.mytests.spring.graphqltestt0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GraphqlTestT0Application {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlTestT0Application.class, args);
    }

}
