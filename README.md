# SpringBoot-CRUD-App

This is a simple Spring Boot application demonstrating **CRUD operations** using standard layered architecture:  
**Controller → Service → Repository → Entity**.

It was developed as a personal project to understand how to build RESTful APIs with Spring Boot and JPA.

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- (Optional: H2/MySQL/PostgreSQL)

---

## 🧱 Project Structure

com.example.project
├── ControllerDB.java // Handles HTTP requests
├── ServiceDB.java // Business logic
├── RepoDB.java // Data access (JPA Repository)
├── EntityDB.java // Entity class (DB mapping)
└── Project2Application.java // Main application entry


---

## 🚀 How to Run the Project

### Prerequisites:
- Java 17 or later
- Maven installed
- IntelliJ IDEA or Eclipse

### Steps:
1. Clone this repository:
git clone https://github.com/Santhoshiini/SpringBoot-CRUD-App.git


2. Open in IntelliJ or Eclipse as a Maven project.

3. Update `application.properties` (if needed) for your database settings.

4. Run:
   Project2Application.java


5. Access API endpoints at:
   http://localhost:8080/


---

## 📌 Features

- Basic CRUD operations
- RESTful API architecture
- Clean layered structure
- Ready for database integration

---

## 🧑‍💻 Author

**Sri Santhoshini V**  
Final-Year AI & DS Student | Future Full Stack Java Developer  
[LinkedIn](https://www.linkedin.com/in/sri-santhoshini)  
[GitHub](https://github.com/Santhoshiini)

---

## 📅 Status

✅ Completed first version — future updates may include:
- Full database integration (H2/MySQL)
- Unit testing with JUnit
- Frontend UI (React or Thymeleaf)



