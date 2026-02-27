# Inventory Management System (Spring Boot)

## 📌 About This Project

This is a personal backend learning project built using Spring Boot and MySQL.  
The purpose of this project was to strengthen my understanding of REST API design, layered architecture, validation, exception handling, and database integration.

Instead of building only basic CRUD operations, I improved the project step by step to simulate real-world backend development practices.

---

## 🚀 Project Objective

To design and implement a RESTful Inventory Management API that allows:

- Adding products
- Viewing all products
- Updating product quantity
- Deleting products
- Searching products by name
- Fetching paginated results

The application follows a layered architecture:

Controller → Service → Repository → Database

This structure ensures clean separation of responsibilities and maintainability.

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (API Testing)

---

## 📦 Features Implemented

### ✅ CRUD Operations
Implemented full Create, Read, Update, Delete functionality using REST endpoints.

### ✅ Field-Level Validation
Used Jakarta Validation to ensure:
- Product name cannot be blank
- Quantity cannot be negative
- Price cannot be negative

This prevents invalid data from being stored in the database.

### ✅ Global Exception Handling
Implemented `@RestControllerAdvice` to:
- Handle validation errors properly
- Return correct HTTP status codes (400, 404)
- Avoid exposing internal server errors

### ✅ Search Functionality
Added dynamic search support:
```
GET /products/search?name=laptop
```

### ✅ Pagination Support
Added pagination for large datasets:
```
GET /products/page?page=0&size=5
```

---

## ⚠ Challenges Faced & How I Solved Them

### 🔹 Validation Returning 500 Error
Initially, when sending invalid data (e.g., negative price), the API returned:
500 Internal Server Error

After debugging, I realized:
- `@Valid` was missing in the controller
- Validation dependency was not configured correctly
- Exceptions were not handled globally

Solution:
- Added `spring-boot-starter-validation`
- Used `@Valid` with `@RequestBody`
- Implemented a global exception handler

This improved API behavior and returned proper 400 Bad Request responses.

---

### 🔹 Understanding Layered Architecture
Initially, I questioned why repository should be an interface instead of a class.

Through learning, I understood:
- Spring Data JPA generates implementation automatically
- It reduces boilerplate code
- It supports abstraction and loose coupling

---

### 🔹 Handling Non-Existent Product IDs
Instead of letting the system fail silently, I implemented:
- Custom `ResourceNotFoundException`
- Proper 404 response handling

This improved error clarity and API reliability.

---

## 🧠 Key Learning Outcomes

Through this project, I gained deeper understanding of:

- REST API design principles
- HTTP status codes
- Validation lifecycle in Spring Boot
- Global exception handling
- JPA repository abstraction
- MySQL integration
- Debugging backend errors effectively

This project helped me move beyond basic tutorials and think more like a backend developer.

---

## 📂 Project Structure

```
controller/
service/
repository/
entity/
exception/
```

Each layer has a defined responsibility to maintain clean architecture.

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /products | Add new product |
| GET | /products | Get all products |
| PUT | /products/{id}?quantity=10 | Update quantity |
| DELETE | /products/{id} | Delete product |
| GET | /products/search?name=lap | Search products |
| GET | /products/page?page=0&size=5 | Paginated results |

---

## 🔮 Future Improvements

- Add JWT authentication
- Add Swagger documentation
- Write unit tests
- Deploy to cloud platform
- Add role-based access control

---

## 👨‍💻 Author

Built as a personal backend learning project to strengthen practical Spring Boot and REST API development skills.