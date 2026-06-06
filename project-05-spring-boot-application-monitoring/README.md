# Project 05 – Spring Boot Application Monitoring

Enterprise Spring Boot Application Monitoring using Spring Boot Actuator, Micrometer, Prometheus, Alertmanager, and Grafana.

---

# Overview

This project demonstrates enterprise-grade application observability for Spring Boot applications.

The monitoring platform provides deep visibility into application performance, JVM health, HTTP requests, memory utilization, thread activity, garbage collection, and database connectivity.

---

# Business Scenario

Enterprise applications require continuous monitoring to ensure:

- High Availability
- Performance Optimization
- Capacity Planning
- Incident Detection
- User Experience Monitoring

Without proper observability, performance degradation may go unnoticed until business services are affected.

---

# Architecture

Spring Boot Application

│

Spring Boot Actuator

│

Micrometer

│

Prometheus

│

Alertmanager

│

Grafana

---

# Components

## Spring Boot Actuator

Provides:

- Health Endpoints
- Metrics Endpoints
- Application Status
- Environment Information

---

## Micrometer

Responsible for:

- Metrics Collection
- JVM Metrics
- HTTP Metrics
- Custom Metrics

---

## Prometheus

Responsible for:

- Metrics Collection
- Time-Series Storage
- Query Processing
- Alert Evaluation

---

## Alertmanager

Responsible for:

- Alert Routing
- Alert Grouping
- Notification Delivery

---

## Grafana

Provides:

- Dashboards
- Reporting
- Data Visualization
- Operational Monitoring

---

# Monitoring Metrics

## JVM Monitoring

- Heap Memory
- Non-Heap Memory
- Garbage Collection
- JVM Uptime

---

## Thread Monitoring

- Live Threads
- Daemon Threads
- Peak Threads

---

## HTTP Monitoring

- Request Count
- Response Time
- Error Rate
- HTTP Status Codes

---

## Database Monitoring

- Active Connections
- Idle Connections
- Query Activity

---

## Application Monitoring

- Health Status
- Uptime
- Availability
- Resource Utilization

---

# Alert Rules

## Application Down

Condition:

Application Unreachable

Severity:

Critical

---

## High Memory Usage

Threshold:

85%

Severity:

Warning

---

## High Response Time

Threshold:

More than 2 Seconds

Severity:

Critical

---

## High Error Rate

Threshold:

More than 5%

Severity:

Critical

---

# Dashboard Panels

- Application Health
- JVM Memory
- JVM Threads
- Garbage Collection
- API Response Times
- Error Rates
- Database Connections

---

# Project Objectives

- Monitor Spring Boot Applications
- Implement JVM Monitoring
- Monitor API Performance
- Configure Alerting Rules
- Build Grafana Dashboards

---

# Technologies Used

- Spring Boot
- Spring Boot Actuator
- Micrometer
- Prometheus
- Grafana
- Alertmanager
- Java 21

---

# Skills Demonstrated

- Application Monitoring
- JVM Monitoring
- Enterprise Observability
- Metrics Engineering
- Performance Monitoring
- Alert Engineering
- Dashboard Design

---

# Author

Alhanoof Alabdullah
