# Project 11 – Security Monitoring Dashboard

Enterprise Security Monitoring Dashboard using Prometheus, ELK Stack, Alertmanager, Grafana, and Security Event Monitoring.

---

# Overview

This project demonstrates enterprise-grade cybersecurity monitoring and security observability.

The platform collects, analyzes, visualizes, and alerts on security-related events from servers, applications, network devices, and authentication systems.

The solution provides a centralized Security Operations Center (SOC) dashboard for security analysts and operations teams.

---

# Business Scenario

Organizations face increasing cybersecurity threats including:

- Unauthorized Access Attempts
- Brute Force Attacks
- Privilege Escalation
- Malware Activity
- Insider Threats
- Suspicious Network Activity

Without centralized monitoring, security incidents may go undetected until significant damage occurs.

---

# Architecture

Servers
│
Applications
│
Authentication Systems
│
Firewalls
│
Security Logs
│
Logstash
│
Elasticsearch
│
Kibana
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

- Security Metrics Collection
- Alert Evaluation
- Security KPI Monitoring

---

## Elasticsearch

Provides:

- Log Storage
- Event Indexing
- Security Event Search

---

## Logstash

Provides:

- Log Parsing
- Data Processing
- Event Normalization

---

## Kibana

Provides:

- Threat Investigation
- Security Dashboards
- Log Analytics

---

## Grafana

Provides:

- Security Metrics Dashboards
- Executive Security Reporting
- SOC Monitoring

---

## Alertmanager

Provides:

- Alert Routing
- Security Notifications
- Incident Escalation

---

# Security Monitoring Areas

## Authentication Monitoring

- Failed Logins
- Successful Logins
- Account Lockouts
- Password Changes

---

## Access Monitoring

- Privileged Access
- Administrative Activity
- User Behavior

---

## System Monitoring

- Unauthorized Processes
- Suspicious Services
- System Integrity Events

---

## Network Monitoring

- Firewall Events
- Network Scans
- Connection Failures
- Security Violations

---

## Threat Monitoring

- Brute Force Detection
- Suspicious Activity Detection
- Security Incident Tracking

---

# Alert Rules

## Excessive Failed Logins

Threshold:

10 Failed Logins

Severity:

Critical

---

## Brute Force Attack

Threshold:

50 Failed Attempts

Severity:

Critical

---

## Unauthorized Administrative Access

Severity:

Critical

---

## Suspicious Process Detected

Severity:

Critical

---

## Firewall Security Event

Severity:

Warning

---

# Dashboard Panels

- Security Overview
- Failed Login Attempts
- Threat Detection
- Security Events
- Firewall Activity
- User Authentication
- Incident Status
- Security KPIs

---

# Security KPIs

- Failed Login Rate
- Security Incidents
- Threat Detection Count
- Mean Time To Detect (MTTD)
- Mean Time To Respond (MTTR)

---

# Technologies Used

- Prometheus
- Grafana
- Alertmanager
- Elasticsearch
- Logstash
- Kibana
- Docker

---

# Skills Demonstrated

- Security Monitoring
- SOC Operations
- SIEM Fundamentals
- Threat Detection
- Log Analysis
- Security Analytics
- Cybersecurity Monitoring
- Incident Response

---

# Author

Alhanoof Alabdullah
