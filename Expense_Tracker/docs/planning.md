# 📋 Expense Tracker - Project Planning

> **Project:** Expense Tracker  
> **Language:** Java  
> **Developer:** ⭐ ANSH ⭐

---

# 🎯 Project Goal

Build a beginner-friendly Expense Tracker using **Core Java**, **OOP**, and **File Handling** without using any database.

The main objective of this project was not only to build an application but also to understand how real Java projects are organized.

---

# 🏗 Project Architecture

```text
Main.java
      │
      ▼
ExpenseTrackerApp
      │
      ▼
Dashboard
      │
      ▼
ExpenseManager
      │
      ▼
FileManager
      │
      ▼
expenses.csv
```

---

# 📂 Class Planning

## Main.java

### Responsibility

- Entry Point
- Starts the application

---

## ExpenseTrackerApp.java

### Responsibility

- Runs the application
- Controls dashboard loop
- Handles user choices
- Connects Dashboard with ExpenseManager

---

## Dashboard.java

### Responsibility

- Display menu
- Accept user choice

---

## Expense.java

### Responsibility

Represents one expense.

Stores:

- Category
- Description
- Amount
- Date

---

## ExpenseManager.java

### Responsibility

Business Logic Layer

Responsible for

- Add Expense
- View Expense
- Search Expense
- Delete Expense
- Calculate Total Expense

---

## FileManager.java

### Responsibility

All File Operations

Responsible for

- Save CSV
- Read CSV
- Search CSV
- Delete Record
- Calculate Total

---

## Validation.java

### Responsibility

Input Validation

Checks

- Category
- Description
- Amount
- Date

---

# 📄 Database Planning

Storage Type

```
CSV File
```

Location

```
database/expenses.csv
```

Reason

- Easy to understand
- Beginner Friendly
- No database installation required
- Perfect for learning File Handling

---

# 🛠 Development Phases

## Phase 1

Project Structure

✅ Completed

---

## Phase 2

Dashboard

✅ Completed

---

## Phase 3

Expense Model

✅ Completed

---

## Phase 4

Validation

✅ Completed

---

## Phase 5

File Handling

✅ Completed

---

## Phase 6

CRUD Operations

✅ Add Expense

✅ View Expense

✅ Search Expense

✅ Delete Expense

---

## Phase 7

Total Expense

✅ Completed

---

## Phase 8

Documentation

✅ README

✅ NOTES

✅ FLOWCHART

✅ PLANNING

---

# 📚 Java Concepts Practiced

- Classes
- Objects
- Methods
- Loops
- Switch Case
- Arrays
- Strings
- File Handling
- Exception Handling
- CSV Parsing
- Object Communication
- Validation
- Temporary File Technique

---

# 🧠 Design Decisions

### Why CSV?

Simple database for beginners.

---

### Why Separate FileManager?

To keep file handling independent from business logic.

---

### Why ExpenseManager?

To manage application logic separately from file operations.

---

### Why Dashboard?

To separate UI from business logic.

---

### Why ExpenseTrackerApp?

To keep Main.java clean and professional.

---

# 🚀 Version 1 Features

- Console Based Application
- CSV Storage
- CRUD Operations
- Validation
- Total Expense
- Continuous Menu
- Layered Architecture

---

# 🚀 Planned Version 2

## Functional Improvements

- Auto Expense ID
- Update Expense
- Duplicate Description Check
- Category Selection Menu
- Better Date Validation
- Expense Sorting
- Monthly Expense Report

---

## UI Improvements

- Better Console Formatting
- Colored Console Output
- Better Error Messages

---

## Technical Improvements

- Getters & Setters
- Constructors
- Collections (ArrayList)
- Generics
- Enums
- LocalDate
- Java Streams

---

## Future Roadmap

```
Expense Tracker (Console)

↓

Swing GUI

↓

JavaFX

↓

JDBC

↓

MySQL

↓

REST API

↓

Flutter Mobile App
```

---

# 🎯 Learning Outcome

This project helped me understand:

✔ Project Planning

✔ Project Structure

✔ Java OOP

✔ CRUD Operations

✔ File Handling

✔ CSV Database

✔ Layered Architecture

✔ Debugging

✔ Java Documentation

✔ Clean Code Organization

---

# 💡 Biggest Learning

> Building projects teaches more than watching tutorials.

Every feature was implemented step-by-step with proper planning, debugging, and understanding instead of simply copying code.

---

# 👨‍💻 Developed By

# ⭐ ANSH ⭐

Learning Java through real projects.

> **"Plan → Build → Debug → Improve → Repeat." 🚀**