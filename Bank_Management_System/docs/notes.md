# 📚 Bank Management System Notes

This document contains the complete learning notes, concepts, design decisions, and important observations made during the development of the Bank Management System.

---

# 🎯 Purpose of the Project

The primary objective of this project was not only to create a banking application but also to learn Core Java by applying concepts in a real-world project.

The project helped in understanding:

- Object-Oriented Programming
- File Handling
- Input Validation
- Authentication
- Project Structure
- Software Design

---

# 🧠 Core Java Concepts Used

## Variables

Used to store:

- Name
- Account Number
- PIN
- Balance

---

## Scanner

Used for taking user input.

Example:

```java
Scanner sc = new Scanner(System.in);
```

---

## Conditional Statements

Used for:

- Login Validation
- Deposit Validation
- Withdraw Validation
- Input Validation

Examples:

- if
- else
- switch

---

## Loops

Used to repeatedly take valid input.

Example:

```java
while(true){

}
```

The loop only terminates after receiving valid input.

---

# 🏦 OOP Concepts Used

## Class

Each real-world entity was represented using a separate class.

Classes used:

- Main
- BankAccount
- Dashboard
- Validation
- TransactionManager
- FileManager

---

## Object

Objects were created whenever functionality was required.

Example:

```java
Validation valid = new Validation();

FileManager fm = new FileManager();

TransactionManager tm = new TransactionManager();
```

---

## Constructor

Two constructors were used.

### Default Constructor

```java
BankAccount(){

}
```

Used when creating an empty object.

---

### Parameterized Constructor

```java
BankAccount(String name,long accNumber,int pin,int balance)
```

Used while creating the current user object after successful login.

---

## Object Passing

Instead of sending multiple variables,

```java
name

accNumber

pin

balance
```

a complete object was passed.

Example:

```java
depositMoney(currentUser, amount);
```

Advantages:

- Cleaner code
- Better readability
- Better software design

---

# 📂 File Handling

## BufferedWriter

Used for writing account data.

Example:

```java
BufferedWriter bw =
new BufferedWriter(
new FileWriter(...));
```

---

## BufferedReader

Used for reading account data.

Example:

```java
BufferedReader br =
new BufferedReader(
new FileReader(...));
```

---

## CSV Storage

Instead of storing data in multiple formatted lines,

accounts are stored using CSV.

Example:

```text
1000000000,Ansh,1234,5000
```

Advantages:

- Easier Reading
- Easier Updating
- Easier Searching
- Less Code

---

# ✂️ split()

One of the most useful methods used in the project.

Example:

```java
String line="1000000000,Ansh,1234,5000";

String data[]=line.split(",");
```

Result

```
data[0] = 1000000000

data[1] = Ansh

data[2] = 1234

data[3] = 5000
```

---

# 🔢 parseInt()

Used to convert String into Integer.

Example

```java
String balance="5000";

int b=Integer.parseInt(balance);
```

Result

```
5000
```

(int)

---

# 🔢 parseLong()

Used to convert String into long.

Example

```java
String account="1000000000";

long acc=Long.parseLong(account);
```

---

# 🔐 Login Logic

Algorithm

```
Read File

↓

Split Line

↓

Compare Account Number

↓

Compare PIN

↓

Create currentUser Object

↓

Return Object
```

---

# 👤 currentUser Object

The current logged-in user is stored inside

```java
BankAccount currentUser
```

This object contains

- Name
- Account Number
- PIN
- Balance

This object is used throughout the dashboard.

---

# 💰 Deposit Logic

```
Input Amount

↓

Validate

↓

Balance += Amount

↓

Update File
```

---

# 💸 Withdraw Logic

```
Input Amount

↓

Validate

↓

Balance >= Amount ?

↓

Yes

↓

Balance -= Amount

↓

Update File
```

---

# 📂 File Update Algorithm

Updating a single line inside a text file is difficult.

Therefore,

```
Read Original File

↓

Create temp.txt

↓

Copy Records

↓

Replace Current User Data

↓

Delete Old File

↓

Rename temp.txt
```

---

# 📌 Project Design

Responsibilities were divided among multiple classes.

```
Main

↓

Validation

↓

TransactionManager

↓

FileManager

↓

accounts.txt
```

This makes the project modular.

---

# 🧩 Why Separate Classes?

## Validation

Responsible only for validation.

---

## Dashboard

Responsible only for displaying menu.

---

## TransactionManager

Responsible only for banking transactions.

---

## FileManager

Responsible only for file handling.

---

## Main

Responsible only for application flow.

---

# 📈 Advantages of Modular Programming

- Easy Maintenance
- Easy Debugging
- Better Readability
- Code Reusability
- Professional Structure

---

# 🐞 Problems Faced

During development the following challenges were encountered:

- Scanner nextLine() issue
- File Not Found Exception
- Login Authentication
- Constructor Confusion
- Object Passing
- Updating Balance
- Temporary File Handling
- CSV Data Storage

---

# 💡 Solutions Learned

- Used nextLine() carefully after nextInt()
- Used constructors to initialize objects
- Stored current logged-in user in an object
- Switched to CSV format
- Used split() for reading records
- Used parseInt() and parseLong() for conversion

---

# 📚 Important Java Methods Used

```
split()

substring()

parseInt()

parseLong()

startsWith()

trim()

isEmpty()

newLine()

delete()

renameTo()
```

---

# 🎯 Best Practices Followed

- Separate Classes
- Small Methods
- Input Validation
- Object Passing
- Modular Design
- Reusable Code
- Meaningful Variable Names

---

# ❌ Common Mistakes Avoided

- Duplicate Code
- Global Variables
- Mixing UI and File Handling
- Direct Balance Manipulation
- No Validation

---

# 🏆 Learning Outcome

After completing this project I can confidently work with:

- Core Java
- OOP
- Constructors
- Objects
- File Handling
- BufferedReader
- BufferedWriter
- CSV Data
- Validation
- Authentication
- Modular Programming

---

# 💼 Interview Questions

### Why did you create a Validation class?

To separate validation logic from business logic.

---

### Why did you create FileManager?

To keep all file operations in one place.

---

### Why did you use currentUser?

To represent the logged-in user throughout the application.

---

### Why did you use CSV instead of formatted text?

Because CSV makes searching, updating, and reading much easier.

---

### Why did you use OOP?

To organize the project into reusable and maintainable modules.

---

# 🚀 Future Scope

- Delete Account
- Change PIN
- Transaction History
- Money Transfer
- Java Swing GUI
- MySQL Integration
- Password Encryption
- Admin Panel

---

# 📝 Final Conclusion

This project was built as a learning-oriented banking application to strengthen Core Java fundamentals.

It demonstrates practical implementation of Object-Oriented Programming, File Handling, Input Validation, Authentication, and Modular Software Design.

The project serves as a strong foundation for learning advanced Java technologies such as JDBC, Java Swing, Spring Boot, and MySQL in future projects.