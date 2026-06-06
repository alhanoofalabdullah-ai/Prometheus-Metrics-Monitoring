# Project 09 – Cloud Infrastructure Monitoring

Enterprise Cloud Infrastructure Monitoring using Prometheus, Grafana, Alertmanager, AWS CloudWatch Exporter, Azure Monitor Exporter, and Google Cloud Monitoring Exporter.

---

# Overview

This project demonstrates enterprise-grade cloud observability across multi-cloud environments including AWS, Microsoft Azure, and Google Cloud Platform (GCP).

The platform provides centralized monitoring, alerting, and visualization for cloud resources, services, workloads, and infrastructure performance.

---

# Business Scenario

Modern enterprises operate workloads across multiple cloud providers.

Cloud environments require monitoring for:

- Virtual Machines
- Storage Services
- Databases
- Load Balancers
- Kubernetes Clusters
- Serverless Functions
- Network Resources

Without centralized monitoring, organizations face operational blind spots and delayed incident response.

---

# Architecture

AWS Cloud
│
Azure Cloud
│
Google Cloud
│
Cloud Exporters
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
- Query Processing
- Alert Evaluation

---

## AWS CloudWatch Exporter

Provides:

- EC2 Metrics
- RDS Metrics
- ELB Metrics
- EKS Metrics
- Lambda Metrics

---

## Azure Monitor Exporter

Provides:

- Virtual Machine Metrics
- Azure SQL Metrics
- AKS Metrics
- Storage Metrics

---

## Google Cloud Monitoring Exporter

Provides:

- Compute Engine Metrics
- Cloud SQL Metrics
- GKE Metrics
- Cloud Storage Metrics

---

## Alertmanager

Responsible for:

- Alert Routing
- Alert Grouping
- Incident Notification

---

## Grafana

Provides:

- Dashboards
- Reporting
- Visualization
- Operational Insights

---

# Monitoring Metrics

## Compute Metrics

- CPU Utilization
- Memory Utilization
- Instance Health
- VM Performance

---

## Storage Metrics

- Storage Capacity
- Disk Usage
- Storage Growth
- IOPS

---

## Database Metrics

- Connections
- Query Performance
- Availability
- Replication Health

---

## Network Metrics

- Bandwidth Usage
- Packet Throughput
- Network Latency
- Error Rates

---

## Kubernetes Metrics

- Cluster Health
- Pod Status
- Node Performance
- Resource Utilization

---

# Alert Rules

## Cloud Resource Down

Severity:

Critical

---

## High CPU Utilization

Threshold:

80%

Severity:

Warning

---

## High Memory Utilization

Threshold:

85%

Severity:

Warning

---

## Storage Capacity Critical

Threshold:

90%

Severity:

Critical

---

## Database Availability Issue

Severity:

Critical

---

# Dashboard Panels

- Multi-Cloud Overview
- AWS Monitoring
- Azure Monitoring
- GCP Monitoring
- Compute Resources
- Storage Metrics
- Network Metrics
- Database Monitoring

---

# Technologies Used

- Prometheus
- Grafana
- Alertmanager
- AWS CloudWatch
- Azure Monitor
- Google Cloud Monitoring
- Terraform
- Docker

---

# Skills Demonstrated

- Cloud Monitoring
- Multi-Cloud Architecture
- Infrastructure Monitoring
- Cloud Operations
- Observability Engineering
- DevOps Monitoring
- Incident Management
- Enterprise Monitoring

---

# Author

Alhanoof Alabdullah
