# 📊 Expense Tracker - Flowcharts

> **Project:** Expense Tracker  
> **Language:** Java  
> **Developer:** ⭐ ANSH ⭐

---

# 🏗 Overall Project Architecture

```mermaid
flowchart TD

A[Main.java]
--> B[ExpenseTrackerApp]

B --> C[Dashboard]

C --> D{User Choice}

D -->|1| E[ExpenseManager]
D -->|2| E
D -->|3| E
D -->|4| E
D -->|5| E
D -->|6| X[Exit]

E --> F[FileManager]

F --> G[(expenses.csv)]
```

---

# 📂 Add Expense Flow

```mermaid
flowchart TD

A[User Selects Add Expense]
--> B[ExpenseManager.addExpense]

B --> C[Take User Input]

C --> D[Validation]

D -->|Valid| E[Create Expense Object]

E --> F[FileManager.saveExpense]

F --> G[Write to CSV]

G --> H[Expense Added Successfully]
```

---

# 📖 View Expense Flow

```mermaid
flowchart TD

A[User Selects View Expense]

--> B[ExpenseManager.viewExpense]

B --> C[FileManager.viewExpense]

C --> D[Open CSV]

D --> E[Read Every Line]

E --> F[Display Expenses]

F --> G[Close File]
```

---

# 🔍 Search Expense Flow

```mermaid
flowchart TD

A[User Enters Description]

--> B[ExpenseManager.searchExpense]

B --> C[FileManager.searchExpense]

C --> D[Open CSV]

D --> E[Read Line]

E --> F[Split Data]

F --> G{Description Match?}

G -->|Yes| H[Display Expense]

G -->|No| I[Read Next Line]

I --> G

H --> J[End]
```

---

# 🗑 Delete Expense Flow

```mermaid
flowchart TD

A[User Enters Description]

--> B[ExpenseManager.deleteExpense]

B --> C[Open expenses.csv]

C --> D[Create temp.csv]

D --> E[Read Line]

E --> F{Header?}

F -->|Yes| G[Write Header]

F -->|No| H[Split Data]

H --> I{Description Match?}

I -->|Yes| J[Skip Line]

I -->|No| K[Write Line to temp.csv]

G --> E

J --> E

K --> E

E --> L[Close Files]

L --> M[Delete Old CSV]

M --> N[Rename temp.csv]

N --> O[Expense Deleted]
```

---

# 💰 Total Expense Flow

```mermaid
flowchart TD

A[User Selects Total Expense]

--> B[ExpenseManager.totalExpense]

B --> C[FileManager.totalExpense]

C --> D[Open CSV]

D --> E[Skip Header]

E --> F[Split Data]

F --> G[Extract Amount]

G --> H[Convert String to Integer]

H --> I[Add to Total]

I --> J{More Records?}

J -->|Yes| E

J -->|No| K[Display Total Expense]
```

---

# 💾 Save Expense Workflow

```mermaid
sequenceDiagram

participant User
participant ExpenseManager
participant Expense
participant FileManager
participant CSV

User->>ExpenseManager: Add Expense

ExpenseManager->>Expense: Create Object

ExpenseManager->>FileManager: saveExpense()

FileManager->>CSV: Write Data

CSV-->>FileManager: Success

FileManager-->>ExpenseManager: true

ExpenseManager-->>User: Expense Added Successfully
```

---

# 🗑 Delete Workflow

```mermaid
sequenceDiagram

participant User
participant ExpenseManager
participant FileManager
participant expenses.csv
participant temp.csv

User->>ExpenseManager: Delete Expense

ExpenseManager->>FileManager: deleteExpense()

FileManager->>expenses.csv: Read Data

expenses.csv-->>FileManager: Return Lines

FileManager->>temp.csv: Write Remaining Records

FileManager->>expenses.csv: Delete Original

FileManager->>temp.csv: Rename to expenses.csv

FileManager-->>User: Expense Deleted
```

---

# 🏛 Project Layer Architecture

```mermaid
flowchart LR

A[Presentation Layer]

-->

B[Business Layer]

-->

C[File Handling Layer]

-->

D[CSV Database]
```

---

# 📦 Class Relationship Diagram

```mermaid
classDiagram

class Main

class ExpenseTrackerApp

class Dashboard

class ExpenseManager

class FileManager

class Expense

class Validation

Main --> ExpenseTrackerApp

ExpenseTrackerApp --> Dashboard

ExpenseTrackerApp --> ExpenseManager

ExpenseManager --> Expense

ExpenseManager --> Validation

ExpenseManager --> FileManager

FileManager --> Expense
```

---

# 🚀 Future Version Roadmap

```mermaid
flowchart LR

A[Expense Tracker v1]

-->

B[Swing GUI]

-->

C[JDBC]

-->

D[MySQL]

-->

E[JavaFX]

-->

F[Spring Boot REST API]

-->

G[Flutter Mobile App]
```

---

# 👨‍💻 Developed By

# ⭐ ANSH ⭐

> **"Good developers write code. Great developers document their code." 🚀**