package com.alhanoof.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot Monitoring Application Running";
    }

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Application Healthy";
    }
}
