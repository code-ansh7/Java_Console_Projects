# 📝 Expense Tracker - Project Notes

> **Project Name:** Expense Tracker  
> **Language:** Java  
> **Storage:** CSV File  
> **Project Type:** Console Based CRUD Application

---

# 🎯 Project Objective

The main objective of this project is to learn:

- Object-Oriented Programming (OOP)
- File Handling
- CSV Database
- CRUD Operations
- Project Structure
- Validation
- Code Organization

---

# 📚 Java Concepts Used

## OOP

- Classes
- Objects
- Methods
- Variables
- Object Creation
- Object Passing

---

## File Handling

- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- File Class

---

## Exception Handling

- try
- catch
- IOException

---

## String Methods

- split()
- trim()
- equalsIgnoreCase()

---

## Type Conversion

```java
Integer.parseInt()
```

Used to convert String into Integer.

Example

```java
String num = "250";
int amount = Integer.parseInt(num);
```

---

# 📂 Class Responsibilities

## Main.java

- Entry Point of the project.
- Creates ExpenseTrackerApp object.
- Starts the application.

---

## ExpenseTrackerApp.java

Responsible for:

- Running application
- Dashboard loop
- Switch Case
- Calling ExpenseManager

---

## Dashboard.java

Responsible for:

- Displaying Menu
- Taking User Choice

---

## Expense.java

Represents one Expense.

Stores

- Category
- Description
- Amount
- Date

Methods

- createExpense()
- displayExpense()

---

## ExpenseManager.java

Acts as Business Logic Layer.

Responsible for

- Add Expense
- View Expense
- Search Expense
- Delete Expense
- Total Expense

---

## FileManager.java

Responsible for all File Operations.

Methods

- saveExpense()
- viewExpense()
- searchExpense()
- deleteExpense()
- totalExpense()

---

## Validation.java

Responsible for validating user input.

Checks

- Category
- Description
- Amount
- Date

---

# 📄 CSV Structure

```text
Category, Description, Amount, Date
Food, Pizza, 250, 01-07-2026
Travel, Metro, 100, 02-07-2026
```

---

# 🔥 Features Implemented

## 1. Add Expense

Flow

User Input

↓

Validation

↓

Expense Object

↓

Save to CSV

↓

Success Message

---

## 2. View Expense

Flow

Open CSV

↓

Read Line

↓

Print

↓

Close File

---

## 3. Search Expense

Flow

Open CSV

↓

Read Line

↓

Split Data

↓

Compare Description

↓

Display Expense

---

## 4. Delete Expense

Flow

Open expenses.csv

↓

Create temp.csv

↓

Copy Every Line

↓

Skip Matching Expense

↓

Delete Old File

↓

Rename temp.csv

↓

Done

---

## 5. Total Expense

Flow

Read CSV

↓

Skip Header

↓

Split Data

↓

Convert Amount to Integer

↓

Add Amount

↓

Display Total

---

# 📚 Important Java Methods Learned

## split()

```java
String data[] = line.split(", ");
```

Used to separate CSV data.

---

## trim()

```java
data[1].trim()
```

Removes extra spaces.

---

## equalsIgnoreCase()

```java
data[1].equalsIgnoreCase(description)
```

Compares Strings without considering uppercase or lowercase.

---

## Integer.parseInt()

```java
int amount = Integer.parseInt(data[2]);
```

Converts String into Integer.

---

# 📁 File Handling Pattern

## Save

Create FileWriter

↓

Write Data

↓

newLine()

↓

Close File

---

## Read

Create BufferedReader

↓

Read Line

↓

Process Data

↓

Close File

---

## Delete

Read Original File

↓

Write Remaining Data into temp.csv

↓

Delete Original File

↓

Rename temp.csv

---

# 🎯 Validation Rules

Category

- Cannot be Empty

Description

- Cannot be Empty

Amount

- Must be Greater than 0

Date

- Cannot be Empty

---

# 💡 Major Learnings

✔ Layered Project Structure

✔ CRUD Operations

✔ CSV Database

✔ Object Passing

✔ Validation

✔ Menu Driven Program

✔ File Handling

✔ Exception Handling

✔ String Manipulation

✔ Debugging

✔ Temporary File Technique

---

# 🚀 Future Improvements

- Auto Expense ID
- Update Expense
- Category Selection
- Monthly Report
- Swing GUI
- MySQL Database
- Charts & Reports
- JavaFX Version

---

# 🏆 Project Outcome

This project helped in understanding:

- How a real Java project is structured.
- How CRUD operations work.
- How data is stored in CSV files.
- How different classes communicate with each other.
- How file handling works in Java.
- How to organize code using separate classes.

---

# 👨‍💻 Developed By

# ⭐ ANSH ⭐

Learning Java one project at a time.

> "Don't just learn syntax, build projects that solve problems." 🚀