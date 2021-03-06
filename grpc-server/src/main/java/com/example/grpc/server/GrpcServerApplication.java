package com.example.grpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class GrpcServerApplication extends SpringBootServletInitializer {

    public static void main(String[] args)   {

        System.out.println("Server running ... ");
        SpringApplication.run(GrpcServerApplication.class, args);
    }
}

