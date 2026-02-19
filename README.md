# Java Employee System

## 📌 Description

Simple **Java (console)** project developed with the goal of practicing **Object-Oriented Programming**, **lists**, **Streams**, **layered architecture**, and **basic coding best practices**.

The system allows **registering and managing employees**, simulating a small administrative system run via the terminal.


---

## ⚙️ Features

* Register an employee
* List registered employees
* Increase an employee's salary by ID
* Basic validations (nonexistent ID, invalid data)
* Interactive console menu

---

## 🧱 Project Structure

```text
src/
 ├── application/
 │    └── Program.java        # Main class (menu and data input)
 ├── entities/
 │    └── Employee.java       # Employee entity
 └── services/
      └── EmployeeService.java # Business logic
```

### 📂 application

Responsible for:

* Displaying the menu
* Reading user input (Scanner)
* Calling service methods

### 📂 entities

Contains the **Employee** entity, responsible only for:

* Attributes
* Constructor
* Getters / Setters
* `toString()`

### 📂 services

Responsible for **business logic**, such as:

* Storing the list of employees
* Searching employees by ID
* Applying salary increases
* Performing validations

---

## 🛠️ Technologies Used

* Java
* Programação Orientada a Objetos (POO)
* Collections (`List`, `ArrayList`)
* Streams e Lambda Expressions
* Scanner (entrada de dados)

---

## ▶️ How to Run

1. Clone the repository
2. Open the project in a Java IDE (IntelliJ, Eclipse, VS Code)
3. Run the `Program.java` class 
4. Interact with the menu via the terminal

---

## 🎯 Project Goal

* Consolidate basic and intermediate Java concepts
* Practice layered code organization
* Simulate a simple real-world system

---

## 📚 Learnings

Through this project, it was possible to practice:

* Separation of concerns
* Using Streams to search in lists
* Organizing code beyond the `main` method
* Structuring a Java project from scratch

---

## 👨‍💻 Author

Henrique Ribeiro

---

