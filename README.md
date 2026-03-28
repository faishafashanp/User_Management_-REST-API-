# User Management REST API

This project is a Spring Boot REST API designed to manage basic user operations.
The system allows users to register, login, and retrieve user data by ID.

The API focuses on implementing backend fundamentals, layered architecture, and service-based validation logic without using database persistence.

---

# Tech Stack
- Java
- Spring Boot
- Spring Web
- Lombok
- Maven
- Postman

---

# Business Flow

1. User submits registration data
2. System validates input data in the Service layer
3. User data is stored temporarily (in-memory simulation)
4. User logs in using registered credentials
5. System validates login data
6. User retrieves data using user ID

## Business Flow Summary

User → Register → Login → Get User Data

---

# System Flow

The system follows a layered architecture.

Client Request  
↓  
Controller (Handle HTTP Request)  
↓  
Service Layer (Business Logic & Validation)  
↓  
DTO / Model Processing  
↓  
Response returned to Client  

---

# API Endpoints

POST /register  
POST /login  
GET /users/{id}  

---

# Author

Faisha Fasha Natasya Putri  

GitHub: https://github.com/faishafashanp  
LinkedIn: https://www.linkedin.com/in/faishafasha  
