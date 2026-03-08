
# Simple Banking Console Application
This repository contains a basic Java console program that simulates a minimal banking system.
It is intended for learning object-oriented programming, encapsulation, and simple user interaction through the command line.

## Project Structure
```
Banking.java        # Main application; contains Bank class and driver (Banking class)
README.md           # Project description and usage instructions
```

## 🏦 Features
- Create a bank account with number, holder name, and starting balance
- Deposit funds into the account
- Withdraw funds (with balance check)
- View current account balance
- Simple menu-driven interface via `Scanner`

##  Design Decisions
- `Bank` class encapsulates account data and operations (`deposit`, `withdraw`, getters)
- Interaction logic remains in the `Banking` class (`main` method)
- Fields in `Bank` are `private` to enforce encapsulation
- Easy to extend for multiple accounts, validation, persistence, or a GUI

### Prerequisites
- Java Development Kit (JDK) 8 or later installed and added to `PATH`

### Compile and Run

```bash
# compile
javac Banking.java

# execute
java Banking
```
Follow the prompts in the terminal to create an account and use the menu.

## Example
```
Enter the account number:
101
Enter the account holder name:
Praveen
Enter the account balance:
5000

Account created successfully!

Choose an option:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```
## 🛠️ Future Improvements

1. Support managing multiple accounts in a collection
2. Validate input and prevent negative transactions
3. Save account data to a file or database
4. Add JUnit tests for `Bank` methods
5. Separate classes into different source files for clarity

## 📄 License
This project is provided for educational purposes and may be freely used, modified, and distributed.
