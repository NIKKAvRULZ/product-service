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
