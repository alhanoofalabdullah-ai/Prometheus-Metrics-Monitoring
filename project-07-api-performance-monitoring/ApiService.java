package com.alhanoof.api.service;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public String getStatus() {
        return "Service Operational";
    }
}
