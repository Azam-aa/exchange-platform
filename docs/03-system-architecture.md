# System Architecture

## Project

Centralized Cryptocurrency Exchange Platform

---

# Purpose

This document describes the overall architecture of the application, how different modules interact, and the technologies used.

The project follows a **Modular Monolith Architecture**, meaning it is a single Spring Boot application divided into independent business modules.

---

# Why Modular Monolith?

- Easy to develop as a solo developer.
- Easier to debug than microservices.
- Better for learning.
- Less infrastructure cost.
- Can later be split into microservices.

---

# High-Level Architecture

```

+-------------------------------------------------------+
| React + TypeScript + Tailwind CSS |
| (Frontend) |
+----------------------+----------------+
|
REST API
|
+----------------------v----------------+
| Spring Boot Application |
| |
| +----------------------------------+ |
| | Authentication Module | |
| +----------------------------------+ |
| |
| +----------------------------------+ |
| | User Module | |
| +----------------------------------+ |
| |
| +----------------------------------+ |
| | Wallet Module | |
| +----------------------------------+ |
| |
| +----------------------------------+ |
| | Order Module | |
| +----------------------------------+ |
| |
| +----------------------------------+ |
| | Matching Engine | |
| +----------------------------------+ |
| |
| +----------------------------------+ |
| | Portfolio Module | |
| +----------------------------------+ |
| |
| +----------------------------------+ |
| | AI Assistant Module | |
| +----------------------------------+ |
+----------------------+----------------+
|
--------------------------------------
| | |
Redis PostgreSQL Kafka
(Cache) (Database) (Events)

```

---

# Technology Architecture

Frontend

- React
- TypeScript
- Tailwind CSS

Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA

Database

- PostgreSQL

Caching

- Redis

Messaging

- Kafka

Monitoring

- Spring Boot Actuator
- Prometheus
- Grafana

Testing

- JUnit
- Mockito
- Testcontainers

Deployment

- Docker
- Docker Compose
- GitHub Actions

---

# Module Responsibilities

## Authentication Module

Responsibilities

- Register User
- Login
- JWT Authentication
- Refresh Token
- Role Management

Depends On

- User Module

---

## User Module

Responsibilities

- User Profile
- Update Profile
- Account Information

Depends On

- Authentication Module

---

## Wallet Module

Responsibilities

- Deposit Funds
- Withdraw Funds
- Wallet Balance
- Transaction History

Depends On

- User Module

---

## Order Module

Responsibilities

- Buy Orders
- Sell Orders
- Market Orders
- Limit Orders
- Cancel Orders

Depends On

- Wallet Module

---

## Matching Engine

Responsibilities

- Match Buy Orders
- Match Sell Orders
- Generate Trades
- Publish Events

Depends On

- Order Module

---

## Portfolio Module

Responsibilities

- Holdings
- Profit/Loss
- Trade History

Depends On

- Wallet Module
- Order Module

---

## AI Assistant Module

Responsibilities

- Answer User Questions
- Explain Trades
- Explain Orders
- Portfolio Insights

Depends On

- Portfolio Module

---

# Request Flow

Example

User Login

Frontend

↓

REST API

↓

Authentication Controller

↓

Authentication Service

↓

User Repository

↓

PostgreSQL

↓

JWT Generated

↓

Response Sent

---

# Trading Flow

User Places Order

↓

Order API

↓

Validation

↓

Wallet Balance Check

↓

Save Order

↓

Kafka Event Published

↓

Matching Engine

↓

Trade Created

↓

Wallet Updated

↓

Portfolio Updated

↓

Response Returned

---

# Database Flow

Controller

↓

Service

↓

Repository

↓

Hibernate

↓

PostgreSQL

---

# Redis Flow

Frequently Requested Data

↓

Redis Cache

↓

If Found

↓

Return Response

↓

Else

↓

Read Database

↓

Update Cache

↓

Return Response

---

# Kafka Flow

Order Created

↓

Kafka Producer

↓

Kafka Topic

↓

Kafka Consumer

↓

Matching Engine

↓

Trade Settlement

---

# Authentication Flow

Register

↓

BCrypt Password Hashing

↓

Database

↓

Login

↓

JWT Token

↓

Client Stores Token

↓

Every API Request

↓

JWT Validation Filter

↓

Access Granted

---

# Monitoring Flow

Spring Boot

↓

Actuator

↓

Prometheus

↓

Grafana Dashboard

---

# Deployment Architecture

Developer Machine

↓

Docker Compose

↓

GitHub Actions

↓

Free Tier Deployment

↓

Users Access Application

---

# Future Architecture

The project can later evolve into microservices by separating:

- Authentication Service
- Wallet Service
- Trading Service
- Matching Engine
- AI Service

Each service can have:

- Independent Database
- Independent Deployment
- Independent Scaling

without changing the business logic because modules are already separated.

---

# Architecture Principles

- Modular Monolith
- Layered Architecture
- SOLID Principles
- Clean Code
- RESTful APIs
- Event-Driven Communication
- Secure Authentication
- Separation of Concerns
- High Maintainability
- Future Microservice Ready