# Project 01 – Linux Server Monitoring

Enterprise Linux Server Monitoring using Prometheus, Node Exporter, Alertmanager, and Grafana.

---

# Overview

This project demonstrates how enterprise organizations monitor Linux servers using Prometheus and Grafana.

The solution collects infrastructure metrics from Linux hosts and visualizes them through real-time dashboards while generating alerts when system resources exceed predefined thresholds.

---

# Business Scenario

Modern enterprises depend on Linux servers for critical business applications.

System administrators need continuous visibility into:

- CPU Utilization
- Memory Usage
- Disk Consumption
- Network Traffic
- System Availability

Without monitoring, infrastructure issues may remain undetected until they impact production services.

---

# Architecture

Linux Server
      |
Node Exporter
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
- Data Storage
- Time-Series Analysis
- Alert Evaluation

---

## Node Exporter

Provides Linux metrics including:

- CPU Usage
- Memory Statistics
- Disk Utilization
- Network Traffic
- System Load

---

## Alertmanager

Handles:

- Alert Routing
- Alert Grouping
- Notification Management

---

## Grafana

Provides:

- Visualization
- Dashboards
- Reporting
- Operational Monitoring

---

# Monitoring Metrics

## CPU Metrics

- CPU Utilization
- CPU Load
- CPU Idle Time

---

## Memory Metrics

- Total Memory
- Used Memory
- Available Memory
- Swap Usage

---

## Disk Metrics

- Disk Capacity
- Disk Utilization
- Free Space

---

## Network Metrics

- Incoming Traffic
- Outgoing Traffic
- Packet Rates

---

## System Metrics

- Uptime
- Load Average
- Running Processes

---

# Alerting Rules

## High CPU Usage

Threshold:

80%

Action:

Generate Critical Alert

---

## High Memory Usage

Threshold:

85%

Action:

Generate Warning Alert

---

## Low Disk Space

Threshold:

15% Free Space

Action:

Generate Critical Alert

---

## Server Down

Condition:

Node Exporter Unreachable

Action:

Immediate Alert

---

# Grafana Dashboards

Dashboard Panels:

- CPU Usage
- Memory Consumption
- Disk Utilization
- Network Traffic
- System Load
- Uptime

---

# Project Objectives

- Deploy Prometheus
- Configure Node Exporter
- Create Grafana Dashboards
- Configure Alerting Rules
- Monitor Linux Infrastructure

---

# Technologies Used

- Prometheus
- Grafana
- Node Exporter
- Alertmanager
- Docker
- Linux

---

# Skills Demonstrated

- Infrastructure Monitoring
- Linux Administration
- Metrics Collection
- Alert Engineering
- Grafana Dashboard Design
- DevOps Monitoring
- Observability Engineering

---

# Author

Alhanoof Alabdullah
