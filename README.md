# 🚀 Lovable Clone: Full-Stack App Builder

[![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Build In Public](https://img.shields.io/badge/Build_In_Public-Day_1-blueviolet?style=for-the-badge)](https://www.linkedin.com/feed/)

An enterprise-grade reconstruction of the **Lovable** platform. This project serves as a showcase of modern Java backend engineering, focusing on scalability, clean architecture, and the latest Spring Boot ecosystem standards.

---

## 🏗 Project Architecture

This project is built following **Clean Architecture** and **SOLID principles** to ensure high maintainability and testability.

### 📂 Layered Breakdown
* **Controller Layer**: Handles RESTful communication and request mapping.
* **Service Layer (Interfaces)**: Defines the business contract, ensuring the core logic is decoupled from the web layer.
* **Persistence Layer**: Utilizes Spring Data JPA for object-relational mapping.
* **Domain Model**: Centralized business entities representing the core system state.
* **DTO Layer (Java Records)**: Compact, immutable data carriers used for API requests and responses.

---

## 🛠 Tech Stack

| Component | Technology |
| :--- | :--- |
| **Language** | Java 21+ |
| **Framework** | Spring Boot 3.x |
| **Persistence** | Spring Data JPA (Hibernate) |
| **Database** | PostgreSQL |
| **Data Handling** | Java Records (DTOs) |
| **Documentation** | SpringDoc OpenAPI (Swagger) |
| **Build Tool** | Maven |

---

## ✅ Progress Log

### Day 1: Foundation & Core Modeling
* **Domain Entities**: Implemented core entities including `User`, `Project`, and `Component` using JPA annotations.
* **Service Abstraction**: Created **Service Layer Interfaces** to facilitate dependency injection and future-proof the business logic.
* **REST Controllers**: Developed initial endpoints for project management and user interaction.
* **Modern DTOs**: Switched from traditional POJOs to **Java Records** to minimize boilerplate and enforce immutability.
* **Exception Handling**: Implemented a global exception handler for consistent API error responses.

---

## 🚀 Getting Started

### Prerequisites
* **JDK 21** or higher
* **Maven 3.8+**
* **Docker** (Optional, for database)

### Installation & Run
1. **Clone the repo**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/lovable-clone.git](https://github.com/YOUR_USERNAME/lovable-clone.git)
