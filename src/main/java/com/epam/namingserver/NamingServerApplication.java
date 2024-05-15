package com.epam.namingserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class NamingServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(NamingServerApplication.class, args);

        Logger logger = LoggerFactory.getLogger(NamingServerApplication.class);
        logger.info("\n\n -------------- naming server started --------------------\n\n");

    }
}

