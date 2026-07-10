# 📊 Quiz Application - Flowcharts

---

# 📌 Project Overview Flow

```mermaid
flowchart TD

A[Start Program] --> B[Main.java]

B --> C[QuizApplication]

C --> D[Display Dashboard]

D --> E{User Choice}

E -->|1| F[Start Quiz]

E -->|2| G[View Rules]

E -->|3| H[Exit Application]

F --> I[QuizManager]

I --> J[Load Questions]

J --> K[Display Questions]

K --> L[Take User Answer]

L --> M[Validate Answer]

M --> N{Correct?}

N -->|Yes| O[Increase Score]

N -->|No| P[Increase Wrong Count]

O --> Q{More Questions?}

P --> Q

Q -->|Yes| K

Q -->|No| R[Display Result]

R --> D

G --> D

H --> S[Program Ends]
```

---

# 📌 Class Interaction Diagram

```mermaid
classDiagram

Main --> QuizApplication

QuizApplication --> Dashboard

QuizApplication --> QuizManager

QuizManager --> FileManager

QuizManager --> Validation

FileManager --> Question

FileManager --> questions.csv

Validation --> InvalidChoiceException
```

---

# 📌 Quiz Execution Flow

```mermaid
flowchart TD

A[Start Quiz]

A --> B[Load Questions From CSV]

B --> C[Store Inside ArrayList]

C --> D[Display Question]

D --> E[Take User Answer]

E --> F[Validate Input]

F --> G{Valid?}

G -->|No| E

G -->|Yes| H{Correct?}

H -->|Yes| I[Score++]

H -->|No| J[Wrong++]

I --> K{More Questions?}

J --> K

K -->|Yes| D

K -->|No| L[Display Result]

L --> M[Return Dashboard]
```

---

# 📌 CSV Loading Flow

```mermaid
flowchart TD

A[Open questions.csv]

A --> B[Read One Line]

B --> C{Header?}

C -->|Yes| B

C -->|No| D[Split Using Comma]

D --> E[Create Question Object]

E --> F[Add Into ArrayList]

F --> G{More Lines?}

G -->|Yes| B

G -->|No| H[Return ArrayList]
```

---

# 📌 Validation Flow

```mermaid
flowchart TD

A[User Input]

A --> B[Length == 1 ?]

B -->|No| C[Invalid Input]

B -->|Yes| D[Convert To Uppercase]

D --> E{A/B/C/D ?}

E -->|Yes| F[Return True]

E -->|No| G[Return False]
```

---

# 📌 Dashboard Flow

```mermaid
flowchart TD

A[Show Dashboard]

A --> B[Take Choice]

B --> C{Choice}

C -->|1| D[Start Quiz]

C -->|2| E[View Rules]

C -->|3| F[Exit]

D --> G[Return Dashboard]

E --> G

F --> H[Program Ends]
```

---

# 📌 Result Calculation Flow

```mermaid
flowchart TD

A[Answer Submitted]

A --> B{Correct?}

B -->|Yes| C[Score++]

B -->|No| D[Wrong++]

C --> E[Next Question]

D --> E

E --> F{Quiz Finished?}

F -->|No| A

F -->|Yes| G[Display Result]
```

---

# 📌 File Handling Flow

```mermaid
flowchart TD

A[FileManager]

A --> B[Open CSV File]

B --> C[Read Line]

C --> D[Split Data]

D --> E[Create Question Object]

E --> F[Store In ArrayList]

F --> G[Return ArrayList]
```

---

# 📌 Complete Application Flow

```mermaid
flowchart LR

Main --> QuizApplication

QuizApplication --> Dashboard

Dashboard --> QuizManager

QuizManager --> FileManager

FileManager --> CSV[(questions.csv)]

CSV --> FileManager

FileManager --> QuizManager

QuizManager --> Validation

Validation --> QuizManager

QuizManager --> Result

Result --> Dashboard

Dashboard --> Exit
```

---

# 🎯 Summary

The application follows a modular architecture where every class has a single responsibility.

- **Main.java** starts the application.
- **QuizApplication.java** controls the application flow.
- **Dashboard.java** interacts with the user.
- **QuizManager.java** manages quiz execution.
- **FileManager.java** handles CSV file operations.
- **Validation.java** validates user input.
- **Question.java** represents each quiz question as an object.
- **InvalidChoiceException.java** handles invalid menu choices.

This architecture makes the project easy to understand, maintain, and extend with future features.