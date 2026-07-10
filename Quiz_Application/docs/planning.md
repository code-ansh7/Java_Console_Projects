# 📋 Java Quiz Application - Project Planning

## 👨‍💻 Developer

**Ansh Rastogi**

---

# 🎯 Project Goal

Build a console-based Quiz Application using Core Java to strengthen Object-Oriented Programming concepts through a real-world project.

The project focuses on clean architecture, code readability, reusable components, and beginner-friendly implementation.

---

# 🎯 Objectives

- Practice OOP Concepts
- Work with Multiple Classes
- Read Data from CSV Files
- Use ArrayList
- Perform Input Validation
- Learn Exception Handling
- Improve Console UI
- Build a Portfolio Project

---

# 🏗 Project Architecture

```
Main
 │
 ▼
QuizApplication
 │
 ▼
Dashboard
 │
 ▼
QuizManager
 │
 ▼
FileManager
 │
 ▼
CSV File
 │
 ▼
ArrayList<Question>
 │
 ▼
Question Object
```

---

# 📂 Class Responsibilities

## Main.java

Application Entry Point.

Responsible for starting the application.

---

## QuizApplication.java

Controls the complete application flow.

Responsibilities

- Dashboard Loop
- Menu Navigation
- Exit Application

---

## Dashboard.java

Displays the Main Menu.

Responsibilities

- Print Dashboard
- Print Rules
- Take User Choice

---

## Question.java

Represents one Quiz Question.

Stores

- Question
- Option A
- Option B
- Option C
- Option D
- Correct Answer

---

## QuizManager.java

Core Quiz Engine.

Responsibilities

- Start Quiz
- Display Questions
- Take Answers
- Validate Answers
- Calculate Score
- Display Result

---

## FileManager.java

Handles File Operations.

Responsibilities

- Read questions.csv
- Create Question Objects
- Store Questions inside ArrayList

---

## Validation.java

Responsible for Input Validation.

Checks

- Valid Answer
- Valid Choice

---

## InvalidChoiceException.java

Custom Exception

Used when user enters an invalid dashboard choice.

---

# 📁 Database

```
questions.csv
```

Stores all quiz questions.

Format

```
Question, OptionA, OptionB, OptionC, OptionD, CorrectAnswer
```

---

# 📊 Current Features

- Dashboard
- Rules
- Quiz Engine
- CSV Loading
- ArrayList
- Validation
- Custom Exception
- Score Calculation
- Result Screen

---

# 🚀 Future Features

## Version 2.0

- Random Questions
- Shuffle Options
- Timer
- Difficulty Levels
- High Score

---

## Version 3.0

- User Login
- Admin Panel
- Add Questions
- Delete Questions
- Edit Questions

---

## Version 4.0

- MySQL Database
- JavaFX GUI
- Authentication
- Leaderboard

---

# 📚 Concepts Practiced

- OOP
- Constructor
- ArrayList
- File Handling
- BufferedReader
- CSV
- Validation
- Exception Handling
- Custom Exception
- Loops
- Objects
- Methods

---

# 🎯 Final Status

```
Planning Completed ✅

Project Completed ✅

Ready for GitHub ✅
```