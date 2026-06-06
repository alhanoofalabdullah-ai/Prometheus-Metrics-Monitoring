package com.alhanoof.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/health")
    public String health() {
        return "API Running";
    }

    @GetMapping("/customers")
    public List<String> customers() {

        return List.of(
                "Ahmed",
                "Sara",
                "Mohammed",
                "Fahad"
        );
    }

    @GetMapping("/orders")
    public List<String> orders() {

        return List.of(
                "Order-1001",
                "Order-1002",
                "Order-1003"
        );
    }
}
