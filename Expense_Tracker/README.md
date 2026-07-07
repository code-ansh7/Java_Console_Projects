# 💸 Expense Tracker

<div align="center">

# 🚀 Expense Tracker (Java + File Handling)

### A Beginner-Friendly Console Based Expense Management System

**Designed & Developed by**

# ⭐ ANSH ⭐

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=java)
![OOP](https://img.shields.io/badge/OOP-Java-blue?style=for-the-badge)
![CSV](https://img.shields.io/badge/Database-CSV-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Project-Completed-brightgreen?style=for-the-badge)

</div>

---

# 📖 About Project

Expense Tracker is a **console-based Java application** developed using **Core Java, Object-Oriented Programming (OOP), File Handling, and CSV Storage**.

The application allows users to manage their daily expenses by adding, viewing, searching, deleting, and calculating total expenses.

This project was built completely from scratch to strengthen concepts of:

- Object-Oriented Programming
- Java File Handling
- CSV Data Storage
- Project Structure
- Code Organization
- Validation
- CRUD Operations

---

# ✨ Features

- ✅ Add New Expense
- ✅ View All Expenses
- ✅ Search Expense by Description
- ✅ Delete Expense by Description
- ✅ Calculate Total Expense
- ✅ Input Validation
- ✅ CSV File Storage
- ✅ Continuous Dashboard Menu
- ✅ Beginner Friendly Project Structure

---

# 🧠 Concepts Used

### Core Java

- Classes & Objects
- Methods
- Constructors
- Variables
- Loops
- Switch Case
- Arrays
- Strings

### OOP

- Encapsulation (Basic)
- Object Creation
- Class Responsibilities

### File Handling

- FileReader
- FileWriter
- BufferedReader
- BufferedWriter

### Exception Handling

- try
- catch
- IOException

### Data Handling

- CSV File
- split()
- Integer.parseInt()

---

# 📂 Project Structure

```text

Expense_Tracker
│
├── 📁 database
│   └── expenses.csv
│
├── 📁 docs
│   ├── planning.md
│   ├── notes.md
|   └── flowchart.md
|
├── 📁 src
│   ├── Dashboard.java
│   ├── Expense.java
│   ├── ExpenseManager.java
│   ├── ExpenseTrackerApp.java
│   ├── FileManager.java
│   ├── Main.java
│   └── Validation.java
|
├── LICENSE
|
└── README.md
 
```

---

# ⚙️ Application Flow

```text
Main
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

# 🚀 How to Run the Project

### 1️⃣ Download the Project

- Clone the repository using Git

```bash
git clone <repository-url>
```

**OR**

- Click **Code → Download ZIP**
- Extract the ZIP file.

---

### 2️⃣ Open the Project

Open the project in **Visual Studio Code** (or any Java IDE).

---

### 3️⃣ Navigate to the Source Folder

Open the terminal and move to the **src** directory.

```bash
cd src
```

---

### 4️⃣ Compile the Project

Compile all Java files.

```bash
javac *.java
```

---

### 5️⃣ Run the Application

```bash
java Main
```

---

### 6️⃣ Start Using the Application

You will see the Expense Tracker dashboard.

```text
===================================
        Expense Tracker
===================================

1. Add Expense
2. View Expense
3. Search Expense
4. Delete Expense
5. Total Expense
6. Exit
```

Simply enter the desired option number and follow the on-screen instructions.

---

### 📁 Database

All expense records are automatically stored in:

```text
database/expenses.csv
```

You can open this file using any spreadsheet editor or a text editor to view the stored data.

> **Note:** The repository includes sample data in `expenses.csv` for demonstration purposes.

---

# 💾 CSV Database

The application stores all expenses inside

```text
database/expenses.csv
```

Example

```csv
Category, Description, Amount, Date
Food, Breakfast at Cafe, 120, 01-07-2026
Travel, Metro Recharge, 150, 01-07-2026
Shopping, Wireless Mouse, 899, 04-07-2026
```

---

# 📌 Dashboard

```text
===================================
        Expense Tracker
===================================

1. Add Expense
2. View Expense
3. Search Expense
4. Delete Expense
5. Total Expense
6. Exit
```

---

# 🔍 Search Logic

```text
Read CSV
      │
      ▼
Split Data
      │
      ▼
Compare Description
      │
      ▼
Expense Found
```

---

# 🗑 Delete Logic

```text
expenses.csv
      │
      ▼
Read Every Line
      │
      ▼
Skip Matching Expense
      │
      ▼
Write Remaining Data
      │
      ▼
temp.csv
      │
      ▼
Replace Original File
```

---

# 💰 Total Expense Logic

```text
Read CSV

↓

Skip Header

↓

Extract Amount

↓

Convert String → Integer

↓

Add All Amounts

↓

Display Total
```

---

# 📚 Java Concepts Practiced

- Object Creation
- Object Passing
- CSV Parsing
- File Reading
- File Writing
- Searching
- File Updating
- Temporary File Technique
- Input Validation
- Looping
- Menu Driven Program

---

# 🚀 Future Improvements (Version 2)

- Auto Expense ID
- Fixed Category Selection
- Update Expense
- Monthly Report
- Category-wise Report
- Date Validation
- Better Console UI
- Swing GUI Version
- MySQL Database
- JavaFX Version

---

# 📊 Project Status

| Feature | Status |
|----------|--------|
| Add Expense | ✅ |
| View Expense | ✅ |
| Search Expense | ✅ |
| Delete Expense | ✅ |
| Total Expense | ✅ |
| Validation | ✅ |
| CSV Database | ✅ |

---

# 🎯 Learning Outcomes

After completing this project, I gained practical experience in:

- Java OOP
- File Handling
- CSV Database
- CRUD Operations
- Project Architecture
- Clean Code Organization
- Debugging
- Java Console Applications

---

# 👨‍💻 Developer

<div align="center">

# ⭐ ANSH ⭐

**Java Developer (Learning)**

Building projects while mastering **Core Java**, **DSA**, and preparing for **App Development**.

> *"Every project is one step closer to becoming a professional software developer."* 🚀

</div>

---

<div align="center">

### ⭐ If you like this project, don't forget to Star the Repository!

Made with ❤️ by **ANSH**

</div>