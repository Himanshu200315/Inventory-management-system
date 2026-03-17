# Inventory Management System (Spring Boot)

## 📌 About This Project

This is a backend-focused project developed using Spring Boot and MySQL to demonstrate real-world REST API design and implementation. The project emphasizes clean architecture, proper validation, structured error handling, and scalable data operations.

It is designed to reflect how production-grade backend systems manage data, handle user input, and maintain reliability.

---

## 🚀 Project Objective

To build a RESTful Inventory Management API that supports:

- Adding new products  
- Viewing all products  
- Updating product quantity  
- Deleting products  
- Searching products by name  
- Retrieving paginated results  

The application follows a layered architecture:

Controller → Service → Repository → Database  

This ensures clear separation of concerns, maintainability, and scalability.

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (API Testing)

---

## 📦 Features

### ✅ CRUD Operations  
Implemented complete Create, Read, Update, and Delete functionality using RESTful endpoints.

### ✅ Data Validation  
Applied Jakarta Validation to enforce:
- Non-empty product names  
- Non-negative quantity  
- Non-negative price  

This ensures only valid data is processed and stored.

### ✅ Exception Handling  
Implemented global exception handling using `@RestControllerAdvice` to:
- Return meaningful error messages  
- Maintain proper HTTP status codes (400, 404)  
- Prevent exposure of internal server errors  

### ✅ Search Functionality  
Supports dynamic search:

```
GET /products/search?name=laptop
```

### ✅ Pagination Support  
Handles large datasets efficiently:

```
GET /products/page?page=0&size=5
```

---

## ⚠ Challenges & Problem-Solving

### 🔹 Handling Validation Errors  
Initial requests with invalid data resulted in internal server errors due to missing validation flow and exception handling.

Resolved by:
- Enabling validation with `@Valid`
- Adding validation dependency
- Implementing centralized exception handling

This ensured proper client-side error responses with correct HTTP status codes.

---

### 🔹 Designing Clean Architecture  
Understanding the role of each layer (Controller, Service, Repository) was key to structuring the application effectively.

This approach improved:
- Code readability  
- Maintainability  
- Separation of responsibilities  

---

### 🔹 Managing Invalid Resource Access  
Handling scenarios where requested products do not exist required proper error management.

Implemented:
- Custom exception handling  
- Clear and consistent API responses  

---

## 🧠 Key Learning Outcomes

- Designing RESTful APIs with proper structure  
- Applying validation and handling errors effectively  
- Working with Spring Data JPA for database operations  
- Understanding layered backend architecture  
- Managing HTTP status codes correctly  
- Debugging backend issues systematically  

---

## 📂 Project Structure

```
controller/
service/
repository/
entity/
exception/
```

Each layer is responsible for a specific part of the application, ensuring clean and modular code organization.

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

## 🔮 Future Enhancements

- JWT-based authentication and authorization  
- Swagger API documentation  
- Unit and integration testing  
- Cloud deployment  
- Role-based access control  

---

## 👨‍💻 Author

Developed as a backend-focused project to strengthen practical understanding of Spring Boot, REST APIs, and scalable application design.
