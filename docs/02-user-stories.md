# User Stories

## Project
Centralized Cryptocurrency Exchange Platform

---

# Introduction

User stories describe the application's features from the perspective of the end user. They help developers understand what needs to be built and are later converted into development tasks.

---

# User Roles

- Guest
- Registered User
- Admin

---

# Guest User Stories

## US-001 - User Registration

**As a Guest**
I want to create an account
So that I can use the trading platform.

### Acceptance Criteria

- User provides name, email and password.
- Email must be unique.
- Password must be securely encrypted.
- User account is created successfully.

Priority: High

Status: Backlog

---

## US-002 - User Login

**As a Guest**
I want to log into my account
So that I can access platform features.

### Acceptance Criteria

- Valid email and password.
- JWT Access Token generated.
- Refresh Token generated.
- Invalid credentials show proper error.

Priority: High

Status: Backlog

---

## US-003 - View Public Market

**As a Guest**

I want to view current cryptocurrency prices

So that I can understand market trends before registering.

Priority: Medium

Status: Backlog

---

# Registered User Stories

## US-004 - View Profile

**As a User**

I want to view my profile information

So that I can verify my account details.

Priority: High

---

## US-005 - Update Profile

**As a User**

I want to update my profile

So that my information remains accurate.

Priority: Medium

---

## US-006 - Deposit Funds

**As a User**

I want to deposit virtual money

So that I can start trading.

Acceptance Criteria

- Deposit amount must be positive.
- Wallet balance updates.
- Transaction history is recorded.

Priority: High

---

## US-007 - Withdraw Funds

**As a User**

I want to withdraw virtual money

So that I can manage my balance.

Acceptance Criteria

- User must have sufficient balance.
- Wallet balance decreases.
- Transaction history updated.

Priority: High

---

## US-008 - View Wallet

**As a User**

I want to check my wallet balance

So that I know how much money I can trade with.

Priority: High

---

## US-009 - Place Buy Order

**As a User**

I want to place a buy order

So that I can purchase cryptocurrency.

Acceptance Criteria

- Balance verification.
- Order stored.
- Order sent to Matching Engine.

Priority: High

---

## US-010 - Place Sell Order

**As a User**

I want to place a sell order

So that I can sell cryptocurrency.

Priority: High

---

## US-011 - Cancel Order

**As a User**

I want to cancel a pending order

So that unwanted orders are removed.

Priority: Medium

---

## US-012 - View Order History

**As a User**

I want to see all my orders

So that I can track trading activity.

Priority: High

---

## US-013 - View Trade History

**As a User**

I want to see completed trades

So that I can analyze my performance.

Priority: High

---

## US-014 - View Portfolio

**As a User**

I want to see my holdings and profit/loss

So that I know my investment status.

Priority: High

---

## US-015 - Receive Live Price Updates

**As a User**

I want cryptocurrency prices to update automatically

So that I always see the latest market price.

Priority: Medium

---

## US-016 - Ask AI Assistant

**As a User**

I want to ask questions about my trades

So that I understand my trading history and platform features.

Example Questions

- Why wasn't my order executed?
- Show my recent trades.
- What is my portfolio value?
- Explain Market Order.
- Explain Limit Order.

Priority: Low (Sprint 4)

---

# Admin User Stories

## US-017 - View Dashboard

**As an Admin**

I want to view platform statistics

So that I can monitor exchange activity.

Priority: Medium

---

## US-018 - Manage Users

**As an Admin**

I want to view all registered users

So that I can manage accounts.

Priority: Medium

---

## US-019 - Suspend User

**As an Admin**

I want to suspend suspicious accounts

So that platform security is maintained.

Priority: Low

---

## US-020 - View System Health

**As an Admin**

I want to monitor system health

So that I know whether services are running properly.

Priority: Low

---

# Product Backlog

## Sprint 1

- User Registration
- Login
- JWT Authentication
- Refresh Token
- PostgreSQL Setup
- User Profile
- Wallet
- Deposit
- Withdraw
- Transaction History

---

## Sprint 2

- Order APIs
- Market Orders
- Limit Orders
- Matching Engine
- Trade History
- Portfolio
- Swagger Documentation

---

## Sprint 3

- Kafka Integration
- Redis Cache
- WebSocket Price Feed
- Docker
- Docker Compose
- Testcontainers
- Unit Testing
- Integration Testing

---

## Sprint 4

- GitHub Actions CI/CD
- Prometheus
- Grafana
- Spring AI
- RAG Assistant
- Deployment
- Performance Optimization
- Security Hardening
- Final Documentation

---

# Definition of Done

A feature is considered complete only if:

- Business logic implemented.
- APIs working.
- Validation added.
- Exception handling added.
- Unit tests written.
- Integration tests passed.
- Swagger updated.
- Code reviewed.
- Docker container builds successfully.
- GitHub pushed.