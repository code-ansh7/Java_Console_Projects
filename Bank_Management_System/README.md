# 🏦 Bank Management System

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk)
![OOP](https://img.shields.io/badge/OOP-Core%20Java-blue?style=for-the-badge)
![File Handling](https://img.shields.io/badge/File%20Handling-CSV-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

A **Console-Based Bank Management System** developed using **Core Java** to demonstrate Object-Oriented Programming (OOP), File Handling, Authentication, Validation, and Modular Software Design.

This project stores account information using **CSV-based file storage** instead of a database and simulates basic banking operations through a console interface.

---

# ✨ Features

- ✅ Create Account
- ✅ Login Authentication
- ✅ Deposit Money
- ✅ Withdraw Money
- ✅ Check Balance
- ✅ View Account Details
- ✅ Logout
- ✅ Input Validation
- ✅ CSV File Storage
- ✅ Persistent Data
- ✅ Modular Code Structure
- ✅ Object-Oriented Programming

---

# 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| OOP | Software Design |
| BufferedReader | Read Data |
| BufferedWriter | Write Data |
| File Handling | Persistent Storage |
| VS Code | Development Environment |
| Git & GitHub | Version Control |

---

# 📂 Project Structure

```
Bank-Management-System/
│
├── src/
│   ├── Main.java
│   ├── BankAccount.java
│   ├── Dashboard.java
│   ├── FileManager.java
│   ├── TransactionManager.java
│   └── Validation.java
│
├── database/
│   └── accounts.txt
│
├── docs/
│   ├── planning.md
│   ├── flowchart.md
│   └── notes.md
│
├── LICENSE
│
└── README.md
```

---

# 🏗 Project Architecture

```
                        User
                          │
                          ▼
                   +--------------+
                   |  Main.java   |
                   +------+-------+
                          │
      +-------------------+-------------------+
      │                   │                   │
      ▼                   ▼                   ▼
 Validation         Dashboard        TransactionManager
                                              │
                                              ▼
                                      FileManager
                                              │
                                              ▼
                                       accounts.txt
```

---

# ⚙ Workflow

```
Application Start

        │

        ▼

Main Menu

        │

 ┌──────┴────────┐

 ▼               ▼

Create         Login

 │               │

 ▼               ▼

Validation   Authentication

 │               │

 ▼               ▼

Save File    Dashboard

                 │

      ┌──────────┼──────────┐

      ▼          ▼          ▼

 Deposit    Withdraw   Check Balance

      │          │          │

      └──────┬───┴──────────┘

             ▼

      Update CSV File

             │

             ▼

          Logout
```

---

# 📁 Database Format

The project stores account data in **CSV format**.

Example:

```text
1000000000,Ansh,1234,50000
1000000001,Vansh,1111,6500
1000000002,Nitin,2222,10000
```

```
AccountNumber,Name,PIN,Balance
```

---

# 📚 OOP Concepts Used

- Classes & Objects
- Constructors
- Object Passing
- Method Calling
- Encapsulation (Basic)
- Modular Programming
- Separation of Concerns

---

# 📖 Java Concepts Used

- Scanner
- Switch Case
- Loops
- Conditional Statements
- String Handling
- File Handling
- Exception Handling
- BufferedReader
- BufferedWriter
- Arrays
- split()
- parseInt()
- parseLong()

---

# 🚀 Documentation

Detailed documentation is available inside the **docs/** folder.

| File | Description |
|------|-------------|
| planning.md | Project Planning & Roadmap |
| flowchart.md | Complete Flowcharts |
| notes.md | Development Notes & Learning |

---

# 💡 Future Improvements

- Delete Account
- Change PIN
- Transaction History
- Money Transfer
- Admin Panel
- Java Swing GUI
- MySQL Database
- Password Encryption
- JDBC Integration

---

# 🎯 Learning Outcomes

This project helped me learn:

- Object-Oriented Programming
- File Handling
- Authentication Logic
- Modular Programming
- CSV Data Management
- Software Design
- Project Documentation
- Git & GitHub Workflow

---

# 👨‍💻 Author

## Ansh Rastogi

**GitHub:** https://github.com/code-ansh7

---

# 📄 License

This project is licensed under the **MIT License**.

See the [LICENSE](LICENSE) file for more details.

---

# ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.