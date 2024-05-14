package com.epam.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class NamingServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(NamingServerApplication.class, args);
        System.out.println("\n\n -------------- naming server started --------------------\n\n");

    }
}

