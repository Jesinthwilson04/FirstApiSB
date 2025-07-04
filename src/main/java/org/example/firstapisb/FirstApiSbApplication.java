package org.example.firstapisb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApiSbApplication {

    public static void main(String[] args) {

        SpringApplication.run(FirstApiSbApplication.class, args);
        System.out.println("Server is up and running");
    }

}
