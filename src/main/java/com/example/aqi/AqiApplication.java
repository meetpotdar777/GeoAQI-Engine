package com.example.aqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AqiApplication {
    public static void main(String[] args) {
        // This line launches the embedded Tomcat server and starts your AQI app
        SpringApplication.run(AqiApplication.class, args);
    }
}