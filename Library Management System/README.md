# Library Management System (Java)

## Description

This is a simple **console-based Library Management System** developed in Java.
The program allows users to manage books in a library by adding books, viewing available books, issuing books, returning books,
and calculating fines for late returns.
This project demonstrates the use of **Object-Oriented Programming (OOP)** concepts, arrays, loops, and user input handling in Java.

---
## Features

* Add new books to the library
* View the list of available books
* Issue books using a unique Book ID
* Return books and calculate fines for late returns
* Automatic Book ID generation
* Menu-driven console interface
---

## Technologies Used

* Java
* Object-Oriented Programming (Classes & Objects)
* Arrays
* Scanner class for user input
---

## How the System Works

1. The user selects an option from the menu.
2. Books can be added with a title and are assigned a unique ID automatically.
3. Books can be issued by entering the Book ID and the issue day.
4. When returning a book, the system calculates the fine if the book is returned after **7 days**.

Fine Calculation:

* Allowed days: **7**
* Fine per extra day: **₹10**

---

## How to Run

### 1. Compile the program

```
javac Library_Management_System.java
```

### 2. Run the program

```
java Library_Management_System
```

---

## Example Menu

```
1. Add Book
2. View Books
3. Issue Books
4. Return Books
5. Exit
```
---

## Example Output

```
--- Welcome to Library Management System ---

1. Add Book
2. View Books
3. Issue Books
4. Return Books
5. Exit
Enter the choice: 1

Enter the Book Title: Java Programming
Book Added Successfully
```
---

## Project Structure

```
Library_Management_System
│
├── Library_Management_System.java
└── README.md
```
---

## Requirements

* Java JDK 8 or higher
* Any Java IDE or terminal

---

## License

This project is open-source and free to use for educational purposes.
