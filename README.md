User Management REST API (Spring Boot)

📌 Project Overview

This project is a simple REST API for User Management built using Spring Boot.
The API provides basic functionalities such as User Registration, User Login, and Get User by ID.

This assignment focuses on understanding backend logic, API design, and layered architecture, without using database persistence yet.

⚠️ Note: This project does not use JPA or SQL yet.
Data handling and validation logic are implemented at the service level.

🧱 Project Architecture

This project applies a layered architecture to separate responsibilities clearly.

Controller → Service → DTO → Model

Layer Explanation
1. Controller
- Defines REST API endpoints
- Handles incoming HTTP requests and outgoing responses
- Does not contain business logic

2. Service
- Contains all business logic and validation
- Handles register, login, and data processing
- Acts as the core of application logic

3. DTO (Data Transfer Object)
- Used to store and transfer request data
- Acts as a temporary data container
- Prevents direct manipulation of the model

4. Model
- Represents data structure (similar to a form)
- Used as a representation of user data
- Not yet connected to a database

🚀 API Features

1️⃣ Register User
Allows users to submit registration data.
All validation and processing logic are handled in the Service layer.

Endpoint :
POST /register

2️⃣ Login User
Allows users to log in using their credentials.
Login validation and logic are handled in the Service layer.

Endpoint :
POST /login

3️⃣ Get User by ID

Retrieves user data based on a specific user ID.

Endpoint :
GET /users/{id}

⚙️ Validation & Logic
All validation logic is implemented inside the Service layer
Controllers are kept thin and only responsible for request/response handling
DTOs are used to store input data before processing



🎯 Purpose of This Project
Practice building REST APIs using Spring Boot
Understand backend layering and separation of concerns
Learn how to structure Controller, Service, DTO, and Model
Prepare a foundation before integrating database (JPA & SQL)

