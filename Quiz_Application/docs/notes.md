# 📝 Quiz Application - Developer Notes

---

# 📌 Project Overview

## Project Name

Java Quiz Application

## Project Type

Java Console Based Project

## Developed By

Ansh Rastogi

## Language Used

- Java
- CSV (Database)

## IDE Used

- Visual Studio Code

---

# 🎯 Project Objective

The objective of this project is to build a simple Quiz Application using Core Java concepts without using any external libraries.

This project is completely console based and reads quiz questions from a CSV file. The user answers each question, gets instant feedback, and finally receives the total score.

This project was created mainly to practice Object-Oriented Programming, File Handling, ArrayList, Exception Handling and Project Architecture.

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

```text
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
            /       \
           ▼         ▼
   FileManager   Validation
         │
         ▼
  questions.csv
```

---

# 📖 Working of Project

When the program starts, execution begins from Main.java.

↓

Main creates the QuizApplication object.

↓

QuizApplication displays the Dashboard.

↓

If the user selects Start Quiz,

↓

QuizManager loads all questions from the CSV file using FileManager.

↓

Each line of the CSV file is converted into a Question object.

↓

All Question objects are stored inside an ArrayList.

↓

QuizManager displays one question at a time.

↓

The user enters an answer.

↓

Validation checks whether the input is valid or not.

↓

If valid

↓

Answer is compared with the correct answer.

↓

Score is updated.

↓

Next question is displayed.

↓

After all questions,

↓

Final Result is displayed.

---

# 📚 Java Concepts Used

## 1. Classes

Every module of the project is divided into separate classes.

Example

- Main
- Dashboard
- Question
- FileManager
- QuizManager
- Validation

Reason

Classes make the project organized and easy to maintain.

---

## 2. Objects

Every class is used through objects.

Example

```java
QuizManager qm = new QuizManager();
```

Objects allow communication between different classes.

---

## 3. Constructor

Constructor is used to initialize Question objects.

Example

```java
Question q = new Question(
    question,
    optionA,
    optionB,
    optionC,
    optionD,
    correctAnswer
);
```

Instead of assigning every variable manually later,
all values are initialized at the time of object creation.

---

## 4. ArrayList

Instead of creating multiple Question variables,

```java
Question q1
Question q2
Question q3
```

all questions are stored inside

```java
ArrayList<Question>
```

Benefits

- Dynamic Size
- Easy Traversal
- Easy Access
- Cleaner Code

---

## 5. File Handling

Questions are stored inside

questions.csv

Java reads this file using

- FileReader
- BufferedReader

Every line is converted into a Question object.

---

## 6. Exception Handling

The project uses try-catch blocks to handle runtime errors.

Example

- File Not Found
- Invalid Input
- Custom Exception

This prevents the application from crashing.

---

## 7. Custom Exception

A custom exception named

InvalidChoiceException

is created.

Purpose

If the user enters anything other than

A
B
C
D

the application throws a custom exception with a meaningful error message.

---

# 📄 Class Explanation

## Main.java

### Responsibility

Entry point of the application.

### Methods

```java
main()
```

### Working

1. JVM starts execution here.
2. QuizApplication object is created.
3. start() method is called.
4. Control moves to QuizApplication.

---

## QuizApplication.java

### Responsibility

Controls the complete application flow.

### Methods

```java
start()
```

### Responsibilities

- Show Dashboard
- Take User Choice
- Call QuizManager
- Show Rules
- Exit Application

Algorithm

Start

↓

Display Dashboard

↓

Take Choice

↓

Switch Case

↓

Start Quiz

↓

OR

↓

View Rules

↓

OR

↓

Exit

↓

Stop
---

# ⚙ Method Wise Working

---

## Dashboard.java

### showDashboard()

### Purpose

Displays the main menu of the Quiz Application.

### Algorithm

```text
Start

↓

Print Heading

↓

Print Menu Options

↓

Print Exit Option

↓

Stop
```

Time Complexity

```
O(1)
```

Space Complexity

```
O(1)
```

---

### dashboardChoice()

### Purpose

Takes menu choice from the user.

### Algorithm

```text
Display Menu

↓

Take Input

↓

Return Choice
```

Time Complexity

```
O(1)
```

Space Complexity

```
O(1)
```

---

## FileManager.java

### loadQuestions()

### Purpose

Reads all quiz questions from the CSV file and stores them inside an ArrayList.

### Step-by-Step Working

1. Create an empty ArrayList.
2. Open questions.csv using BufferedReader.
3. Read one line at a time.
4. Ignore the header row.
5. Split the line using ", ".
6. Store each value into variables.
7. Create a Question object.
8. Add object into ArrayList.
9. Repeat until file ends.
10. Return the ArrayList.

### Algorithm

```text
Start

↓

Create ArrayList

↓

Open CSV File

↓

Read Line

↓

Header?

↓

Yes → Skip

↓

No

↓

Split Data

↓

Create Question Object

↓

Add into ArrayList

↓

Repeat

↓

Return ArrayList

↓

Stop
```

Time Complexity

```
O(n)
```

Space Complexity

```
O(n)
```

---

## Question.java

### Constructor

### Purpose

Initializes every Question object.

### Working

Whenever a Question object is created,

the constructor automatically stores

- Question
- Option A
- Option B
- Option C
- Option D
- Correct Answer

inside the object.

Example

```java
Question q = new Question(
    question,
    optionA,
    optionB,
    optionC,
    optionD,
    correctAnswer
);
```

---

### displayQuestion()

### Purpose

Displays a single quiz question with all four options.

### Algorithm

```text
Print Question

↓

Print Option A

↓

Print Option B

↓

Print Option C

↓

Print Option D

↓

Stop
```

Time Complexity

```
O(1)
```

Space Complexity

```
O(1)
```

---

## Validation.java

### checkAnswer()

### Purpose

Checks whether the entered answer is valid.

Accepted Values

```
A
B
C
D
```

### Algorithm

```text
Take Input

↓

Length == 1 ?

↓

No

↓

Return False

↓

Yes

↓

Convert to Uppercase

↓

A/B/C/D ?

↓

Yes

↓

Return True

↓

Else

↓

Return False
```

Time Complexity

```
O(1)
```

Space Complexity

```
O(1)
```

---

## QuizManager.java

### startQuiz()

### Purpose

Controls the complete quiz process.

Responsibilities

- Display Questions
- Take Answer
- Validate Input
- Check Answer
- Update Score
- Display Result

### Algorithm

```text
Start Quiz

↓

Load Questions

↓

FOR Every Question

↓

Display Question

↓

Take Answer

↓

Validate

↓

Correct?

↓

YES

↓

Score++

↓

NO

↓

Wrong++

↓

Display Correct Answer

↓

Repeat

↓

Print Final Result

↓

Stop
```

Time Complexity

```
O(n)
```

Space Complexity

```
O(1)
```

---

# 📊 Algorithms Used

---

## 1. Sequential Traversal

Used to display every question.

Algorithm

```text
Question 1

↓

Question 2

↓

Question 3

↓

...

↓

Question n
```

Complexity

```
O(n)
```

---

## 2. CSV Reading Algorithm

Algorithm

```text
Open File

↓

Read One Line

↓

Split Data

↓

Create Object

↓

Store in ArrayList

↓

Repeat

↓

Return List
```

Complexity

```
O(n)
```

---

## 3. Score Calculation Algorithm

Algorithm

```text
Correct Answer?

↓

YES

↓

score++

↓

NO

↓

wrong++
```

Complexity

```
O(n)
```

---

## 4. Validation Algorithm

Algorithm

```text
Take Answer

↓

Length == 1 ?

↓

YES

↓

A/B/C/D ?

↓

YES

↓

Valid

↓

NO

↓

Invalid
```

Complexity

```
O(1)
```

---

# ⚠ Errors Faced During Development

## 1. FileNotFoundException

Reason

Wrong relative file path.

Solution

Corrected the file path to the database folder.

---

## 2. IndexOutOfBoundsException

Reason

Loop started from index 1 instead of 0.

Solution

Started iteration from index 0.

---

## 3. Invalid User Input

Reason

User entered values other than A, B, C or D.

Solution

Created Validation class and checked user input before processing.

---

## 4. Lowercase Answer Issue

Reason

User entered lowercase characters.

Solution

Converted input using

```java
answer = answer.toUpperCase();
```

---

## 5. CSV Header Issue

Reason

Header row was being treated as a question.

Solution

Skipped the first line using

```java
if(line.startsWith("Question"))
```

---

# 📈 Time Complexity Summary

| Method | Time Complexity | Space Complexity |
|---------|-----------------|------------------|
| showDashboard() | O(1) | O(1) |
| dashboardChoice() | O(1) | O(1) |
| loadQuestions() | O(n) | O(n) |
| displayQuestion() | O(1) | O(1) |
| checkAnswer() | O(1) | O(1) |
| startQuiz() | O(n) | O(1) |

---

# 🎓 Developer Learnings

While building this project, I learned

- Designing a multi-class Java application.
- Reading structured data from CSV files.
- Working with ArrayList.
- Constructor-based object creation.
- Validation before processing user input.
- Creating and using Custom Exceptions.
- Exception Handling using try-catch.
- Organizing project files using clean architecture.
- Building reusable classes.
- Improving console UI and user experience.

---

# 🚀 Project Development Journey

```text
Idea

↓

Planning

↓

Folder Structure

↓

Question Class

↓

CSV File

↓

FileManager

↓

ArrayList

↓

Quiz Engine

↓

Validation

↓

Custom Exception

↓

Testing

↓

Documentation

↓

Project Completed ✅
```

---

# 🏁 Final Conclusion

This project helped strengthen my understanding of Core Java by combining multiple concepts into a single real-world application.

Instead of writing isolated programs, this project focused on designing a complete application with proper class separation, reusable components, file handling, validation, exception handling, and clean project architecture.

It serves as an important milestone in my Java learning journey and provides a strong foundation for building larger projects such as Student Management System and School Management System.