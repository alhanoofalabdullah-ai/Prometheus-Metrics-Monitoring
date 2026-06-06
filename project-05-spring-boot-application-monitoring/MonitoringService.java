package com.alhanoof.monitoring.service;

import org.springframework.stereotype.Service;

@Service
public class MonitoringService {

    public String getApplicationStatus() {
        return "Application Running Successfully";
    }
}
