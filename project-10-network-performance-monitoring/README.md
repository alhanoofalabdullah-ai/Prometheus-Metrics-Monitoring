# Project 10 – Network Performance Monitoring

Enterprise Network Performance Monitoring using Prometheus, SNMP Exporter, Blackbox Exporter, Alertmanager, and Grafana.

---

# Overview

This project demonstrates enterprise-grade network monitoring for routers, switches, firewalls, WAN links, and network services.

The monitoring platform provides real-time visibility into network performance, bandwidth utilization, latency, packet loss, device availability, and infrastructure health.

---

# Business Scenario

Enterprise networks support business-critical operations.

Without proper monitoring, organizations may experience:

- Network Outages
- WAN Performance Issues
- Packet Loss
- High Latency
- Device Failures
- Service Interruptions

This platform provides centralized monitoring for Network Operations Centers (NOC).

---

# Architecture

Routers
│
Switches
│
Firewalls
│
SNMP Exporter
│
Blackbox Exporter
│
Prometheus
│
Alertmanager
│
Grafana

---

# Components

## Prometheus

Responsible for:

- Metrics Collection
- Time-Series Storage
- Alert Evaluation

---

## SNMP Exporter

Provides:

- Router Metrics
- Switch Metrics
- Firewall Metrics
- Interface Statistics

---

## Blackbox Exporter

Provides:

- Ping Monitoring
- HTTP Monitoring
- TCP Monitoring
- DNS Monitoring

---

## Alertmanager

Responsible for:

- Alert Routing
- Incident Notification
- Escalation Management

---

## Grafana

Provides:

- Dashboards
- Reporting
- Visualization

---

# Monitoring Metrics

## Device Availability

- Router Status
- Switch Status
- Firewall Status

---

## Network Performance

- Latency
- Response Time
- Jitter
- Packet Loss

---

## Interface Monitoring

- Bandwidth Usage
- Traffic Throughput
- Interface Errors
- Interface Utilization

---

## WAN Monitoring

- WAN Availability
- Link Saturation
- Traffic Trends

---

## Security Monitoring

- Firewall Availability
- VPN Status
- Network Access Monitoring

---

# Alert Rules

## Device Down

Severity:

Critical

Condition:

Device Unreachable

---

## High Latency

Threshold:

100 ms

Severity:

Warning

---

## Packet Loss

Threshold:

5%

Severity:

Critical

---

## High Bandwidth Usage

Threshold:

80%

Severity:

Warning

---

## Interface Errors

Threshold:

100 Errors

Severity:

Warning

---

# Dashboard Panels

- Network Overview
- Device Health
- WAN Monitoring
- Bandwidth Utilization
- Packet Loss
- Latency Analysis
- Firewall Monitoring
- Interface Monitoring

---

# Technologies Used

- Prometheus
- Grafana
- Alertmanager
- SNMP Exporter
- Blackbox Exporter
- Docker
- SNMP

---

# Skills Demonstrated

- Network Monitoring
- Infrastructure Monitoring
- NOC Operations
- SNMP Monitoring
- Performance Analysis
- Network Troubleshooting
- Observability Engineering

---

# Author

Alhanoof Alabdullah
