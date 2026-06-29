# 🏦 Bank Management System v1.0

A console-based **Bank Management System** developed using **Core Java**.

This project is built as part of my Java learning journey to understand how real software is designed using **Object-Oriented Programming, File Handling, Validation, and Modular Architecture**.

---

# 🚀 Features

## ✅ Account Management

- Create New Bank Account
- Display Account Details
- Permanent Account Storage
- Multiple Account Support

---

## ✅ Input Validation

- Account Holder Name Validation
- 10-Digit Account Number Validation
- 4-Digit PIN Validation
- Initial Balance Validation

---

## ✅ File Handling

- BufferedWriter
- FileWriter
- Append Mode Storage
- Permanent Data Storage
- Boolean-based Save Operation

---

# 🛠 Technologies Used

- Core Java
- OOP
- File Handling
- BufferedWriter
- Exception Handling
- VS Code
- Git & GitHub

---

# 🏗 System Architecture

```text
                         +------------------+
                         |      USER        |
                         +--------+---------+
                                  |
                                  v
                         +------------------+
                         |    Main.java     |
                         |  (Controller)    |
                         +--------+---------+
                                  |
          +-----------------------+-----------------------+
          |                       |                       |
          v                       v                       v
+------------------+    +------------------+    +------------------+
|  Validation.java |    | BankAccount.java |    | FileManager.java |
|------------------|    |------------------|    |------------------|
| Validate Name    |    | Create Account   |    | Save Account     |
| Validate PIN     |    | Store Details    |    | Write File       |
| Validate Balance |    | Display Details  |    | Append Mode      |
+------------------+    +------------------+    +--------+---------+
                                                          |
                                                          v
                                          +---------------------------+
                                          | database/accounts.txt     |
                                          | Permanent Account Storage |
                                          +---------------------------+
```

---

# 📂 Folder Structure

```text
Bank_Management_System
│
├── src
│   │
│   ├── Main.java
│   ├── BankAccount.java
│   ├── Validation.java
│   └── FileManager.java
│
├── database
│   └── accounts.txt
│
├── docs
│
├── screenshots
│
└── README.md
```

---

# ⚙ Current Workflow

```text
Start Program

↓

Show Main Menu

↓

User Selects Create Account

↓

Take Input

↓

Validate Name

↓

Validate Account Number

↓

Validate PIN

↓

Validate Balance

↓

Create Account Object

↓

Save Account into File

↓

Display Success

↓

End
```

---

# 📌 Responsibilities of Each Class

## Main.java

Responsible for:

- Displaying Menu
- Taking User Input
- Calling Other Classes
- Controlling Program Flow

---

## BankAccount.java

Responsible for:

- Creating Bank Account
- Storing Account Information
- Displaying Account Details

---

## Validation.java

Responsible for:

- Name Validation
- Account Number Validation
- PIN Validation
- Balance Validation

Returns:

- true
- false

---

## FileManager.java

Responsible for:

- Saving Account
- File Handling
- BufferedWriter Operations
- Append Mode Storage

Returns:

- true → Save Successful
- false → Save Failed

---

# 📄 Current Database Format

```text
Name           : Ansh
Account Number : 1000000000
Balance        : 5000

Name           : Vansh
Account Number : 1000000001
Balance        : 5000

Name           : Nitin
Account Number : 1000000002
Balance        : 5000
```

---

# 🧠 Concepts Practiced

- Classes & Objects
- Methods
- Object Communication
- Validation
- Loops
- Conditional Statements
- File Handling
- BufferedWriter
- FileWriter
- Exception Handling
- Boolean Methods
- Project Architecture
- Relative File Paths

---

# 📈 Project Progress

```text
██████████████░░░░░░░░░░░░░░░░ 50%

✅ Main Menu
✅ Account Creation
✅ Input Validation
✅ File Handling
✅ Permanent Storage

⬜ Login
⬜ Deposit
⬜ Withdraw
⬜ Check Balance
⬜ Transaction History
⬜ Close Account
⬜ Mini Dashboard
```

---

# 🚀 Upcoming Features

- Login System
- Deposit Money
- Withdraw Money
- Check Balance
- Transaction History
- Account Search
- Delete Account
- Better File Structure
- Java Swing Version (v2)

---

# 🎯 Learning Goals

This project is helping me understand:

- Real Software Architecture
- OOP Design
- Class Communication
- File Handling
- Software Development Workflow
- Git & GitHub Project Management

---

# 📅 Development Status

**Version :** v1.0

**Status :**
🟢 Active Development

---

# 👨‍💻 Developer

**Ansh Rastogi**

B.Tech CSE Student

Learning Java by building real-world projects.

> **"Programs teach syntax. Projects teach Software Engineering."**