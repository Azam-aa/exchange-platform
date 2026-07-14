# API Design

## Project

Centralized Cryptocurrency Exchange Platform

---

# Purpose

This document defines all REST APIs used in the application.

Each API includes:

- Endpoint
- HTTP Method
- Description
- Authentication
- Request Body
- Response
- Status Codes

Base URL

/api/v1

---

# Authentication Module

## Register User

POST /api/v1/auth/register

Authentication

No

Description

Register a new user.

Request

{
    "firstName": "Azam",
    "lastName": "Pasha",
    "email": "azam@gmail.com",
    "password": "Password@123"
}

Success Response

201 Created

{
    "message": "User registered successfully."
}

---

## Login

POST /api/v1/auth/login

Authentication

No

Request

{
    "email":"azam@gmail.com",
    "password":"Password@123"
}

Response

200 OK

{
    "accessToken":"",
    "refreshToken":""
}

---

## Refresh Token

POST /api/v1/auth/refresh

Authentication

No

Response

200 OK

{
    "accessToken":""
}

---

# User Module

## Get Profile

GET /api/v1/users/profile

Authentication

Yes

Response

200 OK

{
    "id":1,
    "name":"Azam Pasha",
    "email":"azam@gmail.com"
}

---

## Update Profile

PUT /api/v1/users/profile

Authentication

Yes

---

# Wallet Module

## Get Wallet

GET /api/v1/wallet

Authentication

Yes

---

## Deposit Money

POST /api/v1/wallet/deposit

Authentication

Yes

Request

{
    "currency":"USD",
    "amount":1000
}

---

## Withdraw Money

POST /api/v1/wallet/withdraw

Authentication

Yes

Request

{
    "currency":"USD",
    "amount":500
}

---

## Wallet Transactions

GET /api/v1/wallet/transactions

Authentication

Yes

---

# Order Module

## Place Buy Order

POST /api/v1/orders/buy

Authentication

Yes

Request

{
    "symbol":"BTC",
    "orderType":"LIMIT",
    "price":50000,
    "quantity":2
}

---

## Place Sell Order

POST /api/v1/orders/sell

Authentication

Yes

---

## Cancel Order

DELETE /api/v1/orders/{id}

Authentication

Yes

---

## Get User Orders

GET /api/v1/orders

Authentication

Yes

---

# Trade Module

## Trade History

GET /api/v1/trades

Authentication

Yes

---

# Portfolio Module

## Get Portfolio

GET /api/v1/portfolio

Authentication

Yes

---

# Market Module

## Live Prices

GET /api/v1/market/prices

Authentication

No

---

## Order Book

GET /api/v1/market/orderbook/{symbol}

Authentication

No

---

# AI Module

## Ask AI

POST /api/v1/ai/chat

Authentication

Yes

Request

{
    "question":"Why wasn't my order executed?"
}

Response

{
    "answer":"..."
}

---

# Admin Module

## Dashboard

GET /api/v1/admin/dashboard

Authentication

Admin

---

## Users

GET /api/v1/admin/users

Authentication

Admin

---

## Suspend User

PUT /api/v1/admin/users/{id}/suspend

Authentication

Admin

---

# HTTP Status Codes

200 OK

201 Created

204 No Content

400 Bad Request

401 Unauthorized

403 Forbidden

404 Not Found

409 Conflict

500 Internal Server Error

---

# API Versioning

Current Version

/api/v1

Future

/api/v2

---

# Authentication Strategy

Public APIs

- Register
- Login
- Refresh Token
- Market Prices

Protected APIs

Everything else requires JWT Authentication.

---

# Validation Rules

Email

- Required
- Valid Format
- Unique

Password

- Minimum 8 Characters
- One Uppercase
- One Lowercase
- One Number
- One Special Character

Amount

- Greater than zero

Quantity

- Greater than zero

Price

- Greater than zero