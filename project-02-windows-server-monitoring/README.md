# Project 02 – Windows Server Monitoring

Enterprise Windows Server Monitoring using Prometheus, Windows Exporter, Alertmanager, and Grafana.

---

# Overview

This project demonstrates how enterprise organizations monitor Windows Server infrastructure using Prometheus and Grafana.

The monitoring platform collects operating system metrics from Windows Servers and provides real-time visibility into server health, performance, availability, and resource utilization.

---

# Business Scenario

Windows Servers are widely used in enterprise environments for:

- Active Directory
- DNS Services
- File Servers
- Application Servers
- Database Servers

Continuous monitoring is essential to ensure service availability and infrastructure reliability.

---

# Architecture

Windows Server
      |
Windows Exporter
      |
Prometheus
      |
Alertmanager
      |
Grafana

---

# Components

## Prometheus

Responsible for:

- Metrics Collection
- Time-Series Storage
- Query Processing
- Alert Evaluation

---

## Windows Exporter

Provides Windows metrics including:

- CPU Metrics
- Memory Metrics
- Disk Metrics
- Services Monitoring
- Network Monitoring

---

## Alertmanager

Handles:

- Alert Routing
- Alert Grouping
- Notification Delivery

---

## Grafana

Provides:

- Dashboards
- Data Visualization
- Reporting
- Operational Insights

---

# Monitoring Metrics

## CPU Monitoring

- Processor Utilization
- CPU Load
- Processor Queue Length

---

## Memory Monitoring

- Total Memory
- Used Memory
- Available Memory
- Memory Pressure

---

## Disk Monitoring

- Disk Capacity
- Disk Usage
- Free Space

---

## Windows Services Monitoring

- Service Status
- Failed Services
- Running Services
- Critical Service Availability

---

## Network Monitoring

- Network Traffic
- Packets Sent
- Packets Received
- Interface Status

---

# Alert Rules

## High CPU Usage

Threshold:

85%

Severity:

Critical

---

## High Memory Usage

Threshold:

90%

Severity:

Warning

---

## Low Disk Space

Threshold:

10% Free Space

Severity:

Critical

---

## Service Failure

Condition:

Critical Windows Service Stopped

Severity:

Critical

---

# Dashboard Panels

- CPU Usage
- Memory Utilization
- Disk Space
- Service Status
- Network Activity
- System Availability

---

# Project Objectives

- Deploy Windows Exporter
- Configure Prometheus
- Configure Alerting Rules
- Build Grafana Dashboards
- Monitor Windows Infrastructure

---

# Technologies Used

- Prometheus
- Grafana
- Windows Exporter
- Alertmanager
- Docker
- Windows Server

---

# Skills Demonstrated

- Windows Administration
- Infrastructure Monitoring
- Enterprise Observability
- Metrics Collection
- Alert Engineering
- Dashboard Development
- DevOps Monitoring

---

# Author

Alhanoof Alabdullah
