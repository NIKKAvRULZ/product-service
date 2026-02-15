# 🚀 DevOps Lab 03: Building a Spring Boot Microservice
### Module: Current Trends in Software Engineering (SE4010) - 2025 

---

## 📖 Project Overview
This repository contains the implementation of a RESTful **Product Microservice** built with Spring Boot. The project focuses on integrating an in-memory database for rapid development and Swagger UI for automated API documentation.
### ✨ Key Features
* **RESTful CRUD**: Complete implementation of Create, Read, and Delete endpoints.
* **H2 In-Memory DB**: Real-time data persistence without external database setup.
* **Swagger Documentation**: Interactive API testing interface.
* **Clean Architecture**: Separation of concerns into Entity, Repository, and Controller layers.

---

## 🛠 Tech Stack
| Technology | Usage |
| :--- | :--- |
| **Java** | Core Language |
| **Spring Boot** | Application Framework |
| **Maven** | Dependency Management |
| **H2 Database** | In-Memory Storage  |
| **Springdoc OpenAPI** | API Documentation |

---

## 📂 Project Structure
```text
src/main/java/com/sliit/product_service/
├── controller/
│   └── ProductController.java  # REST Endpoints 
├── entity/
│   └── product.java            # Data Model (id, name, price) 
└── repository/
    └── ProductRepository.java  # JPA Data Access 
```
---

## 🚀 Execution & Evidence

### 1. API Documentation (Swagger UI)
Documentation is exposed via Swagger UI. You can test the POST, GET, and DELETE endpoints directly through the browser .
* **URL:** `http://localhost:8080/swagger-ui/index.html` 

> **Evidence:**
> ![Swagger Screenshot](https://via.placeholder.com/800x400?text=Insert+Swagger+UI+Screenshot+Here)

### 2. In-Memory Database (H2 Console)
The H2 console is enabled to verify table creation and data persistence during runtime .
* **URL:** `http://localhost:8080/h2-console` 
* **JDBC URL:** `jdbc:h2:mem:productdb`

> **Evidence:**
> ![H2 Console Screenshot](https://via.placeholder.com/800x400?text=Insert+H2+Console+Screenshot+Here)

### 3. Endpoint Specifications
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/api/products` | Create a new Product |
| **GET** | `/api/products` | Retrieve all Products |
| **GET** | `/api/products/{id}` | Retrieve Product by ID |
| **DELETE** | `/api/products/{id}` | Delete a Product |

---

## ✍️ Student Information
* **Name:** Nithika Perera
* **IT Number:** IT22061348
* **Module:** Current Trends in Software Engineering (SE4010) 
* **Institute:** SLIIT - Faculty of Computing 

---

<p align="center">
  <b>Expected Outcome:</b> Successfully built a microservice with REST APIs, H2 database, and Swagger documentation .
</p>
