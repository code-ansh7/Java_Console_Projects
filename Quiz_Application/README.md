# 🧠 Java Quiz Application

> A Console-Based Quiz Application built using **Core Java**, **Object-Oriented Programming (OOP)**, **ArrayList**, **CSV File Handling**, **Input Validation**, and **Custom Exception Handling**.

---

# 👨‍💻 Developer

# **Ansh Rastogi**

Aspiring Java & Flutter Developer 🚀

---

# 📌 About Project

Java Quiz Application is a simple yet structured console application that allows users to attempt multiple-choice quizzes directly from the terminal.

Questions are stored inside a CSV file and loaded dynamically into memory using **ArrayList**. The application validates every user input, checks answers, calculates the final score, and displays the result after quiz completion.

This project was built to practice real-world implementation of Core Java concepts.

---

# ✨ Features

- 🎯 Interactive Dashboard
- 📚 Quiz Rules
- 📄 CSV-Based Question Storage
- 📥 Dynamic Question Loading
- 📦 ArrayList Implementation
- 🏗 Constructor-Based Object Creation
- ✅ Input Validation
- ⚠ Custom Exception Handling
- 📊 Score Calculation
- ✔ Correct & Wrong Answer Counter
- 🧾 Final Quiz Result
- ♻ Return to Dashboard
- 🚪 Exit Option

---

# 📂 Folder Structure

```text
Quiz_Application
│
├── database
│   └── questions.csv
│
├── docs
│   ├── flowchart.md
│   ├── notes.md
│   └── planning.md
│
├── src
│   ├── Dashboard.java
│   ├── FileManager.java
│   ├── InvalidChoiceException.java
│   ├── Main.java
│   ├── Question.java
│   ├── QuizApplication.java
│   ├── QuizManager.java
│   └── Validation.java
│
├── LICENSE
└── README.md
```

---

# 🏗 Project Architecture

```
                    Main
                     │
                     ▼
            QuizApplication
                     │
                     ▼
              Dashboard Menu
                     │
         ┌───────────┴───────────┐
         ▼                       ▼
     Start Quiz              View Rules
         │
         ▼
     QuizManager
         │
         ▼
     FileManager
         │
         ▼
     questions.csv
         │
         ▼
 ArrayList<Question>
         │
         ▼
 Display Questions
         │
         ▼
 Validate Answer
         │
         ▼
  Calculate Result
         │
         ▼
 Return Dashboard
```

---

# ⚙ Technologies Used

- Java
- Core Java
- Object-Oriented Programming
- Constructor
- ArrayList
- File Handling
- CSV File
- Validation
- Custom Exception
- VS Code

---

# 📚 Java Concepts Used

- Classes & Objects
- Constructors
- Methods
- ArrayList
- BufferedReader
- FileReader
- Exception Handling
- Custom Exception
- Validation
- Loops
- Conditional Statements
- Object Interaction

---

# ▶ Getting Started

### 1️⃣ Clone Repository

```bash
git clone <repository-url>
```

---

### 2️⃣ Open Project

Open the project in **VS Code** or any Java IDE.

---

### 3️⃣ Verify Folder Structure

Make sure the following file exists:

```text
database/
    questions.csv
```

---

### 4️⃣ Navigate to Source Folder

```bash
cd Quiz_Application/src
```

---

### 5️⃣ Compile

```bash
javac *.java
```

---

### 6️⃣ Run

```bash
java Main
```

---

# 📋 Quiz Workflow

```
Dashboard

↓

Start Quiz

↓

Load Questions From CSV

↓

Store in ArrayList

↓

Display Question

↓

Take User Answer

↓

Validate Input

↓

Correct / Wrong

↓

Next Question

↓

Final Result

↓

Dashboard
```

---

# 📷 Sample Output

```text
========================================
             JAVA QUIZ APP
========================================

1. Start Quiz
2. View Rules
3. Exit

Enter Choice : 1

----------------------------------------
Question 1 / 15

What is JVM?

A. Java Virtual Machine

B. Java Variable Method

C. Java Version Manager

D. Java Visual Machine

Enter Answer : A

✅ Correct Answer!
```

---

# 🌟 What Makes This Project Different?

- Uses CSV as a lightweight database.
- Questions are loaded dynamically.
- ArrayList stores all Question objects.
- Constructor-based object creation.
- Separate classes for each responsibility.
- Input validation before evaluation.
- Custom Exception for invalid dashboard choice.
- Clean project architecture following OOP principles.

---

# 📖 Learning Outcomes

While building this project, I learned:

- Multi-class project architecture
- Constructor usage
- CSV File Handling
- Dynamic Object Creation
- ArrayList Implementation
- Validation Techniques
- Custom Exception Handling
- Clean Code Organization
- Console Application Design

---

# 🚀 Future Improvements

- Timer Based Quiz
- Random Question Order
- Difficulty Levels
- Category-wise Quiz
- Negative Marking
- High Score System
- User Login
- Score History
- MySQL Database

---

# 📊 Project Status

```text
Project          : Java Quiz Application

Version          : 1.0

Status           : Completed ✅

Language         : Java

Project Type     : Console Application
```

---

# 📄 License

This project is licensed under the **MIT License**.

---

# ❤️ Developed By

# **Ansh Rastogi**

*"Every project is one step closer to becoming a better developer."* 🚀