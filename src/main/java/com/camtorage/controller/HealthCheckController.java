package com.camtorage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/health")
@RestController
public class HealthCheckController {

    @GetMapping
    public String getHealth() {
        return "server is alive!";
    }
}
