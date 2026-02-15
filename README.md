# 🚀 DevOps Lab 03: Building a Spring Boot Microservice
### [cite_start]Module: Current Trends in Software Engineering (SE4010) - 2025 [cite: 3]

---

## 📖 Project Overview
[cite_start]This repository contains the implementation of a RESTful **Product Microservice** built with Spring Boot[cite: 5]. [cite_start]The project focuses on integrating an in-memory database for rapid development and Swagger UI for automated API documentation[cite: 32].

### ✨ Key Features
* [cite_start]**RESTful CRUD**: Complete implementation of Create, Read, and Delete endpoints[cite: 19].
* [cite_start]**H2 In-Memory DB**: Real-time data persistence without external database setup[cite: 21].
* [cite_start]**Swagger Documentation**: Interactive API testing interface[cite: 27].
* [cite_start]**Clean Architecture**: Separation of concerns into Entity, Repository, and Controller layers[cite: 16, 17, 18].

---

## 🛠 Tech Stack
| Technology | Usage |
| :--- | :--- |
| **Java** | [cite_start]Core Language [cite: 10] |
| **Spring Boot** | [cite_start]Application Framework [cite: 5] |
| **Maven** | [cite_start]Dependency Management [cite: 10] |
| **H2 Database** | [cite_start]In-Memory Storage [cite: 12] |
| **Springdoc OpenAPI** | [cite_start]API Documentation [cite: 12] |

---

## 📂 Project Structure
```text
src/main/java/com/sliit/product_service/
├── controller/
│   └── ProductController.java  # REST Endpoints [cite: 18]
├── entity/
│   └── product.java            # Data Model (id, name, price) [cite: 16]
└── repository/
    └── ProductRepository.java  # JPA Data Access [cite: 17]
