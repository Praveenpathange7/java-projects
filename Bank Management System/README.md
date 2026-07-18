# 🏦 Bank Management System (Java OOP)

A console-based Bank Management System built in Java to demonstrate all core
Object-Oriented Programming concepts in a single, real-world project.

---

## 📌 Features

- ✅ Create **Savings** or **Current** accounts
- 💰 Deposit money with amount validation
- 💸 Withdraw money with account-specific rules:
  - **Savings Account** → minimum balance of ₹1000 must be maintained, max 5 withdrawals per month
  - **Current Account** → overdraft facility up to ₹10,000 (balance can go negative)
- 📈 Interest calculation (4.5% for Savings, 0% for Current)
- 🧾 Transaction history recorded for every deposit/withdrawal
- 🔍 Find account by account number
- 📋 Display all accounts
- ⚠️ Custom exception handling for invalid withdrawals

---

## 🧠 OOP Concepts Demonstrated

- **Abstraction** : `Account` is an abstract class with abstract methods `withdraw()` and `calculateInterest()` — it cannot be instantiated directly
- **Inheritance** : `SavingsAccount` and `CurrentAccount` extend `Account`; `InsufficientBalanceException` extends `Exception`
- **Polymorphism** : The same call `acc.withdraw(amount)` executes different logic at runtime depending on the account type
- **Encapsulation** : All fields are `private` and accessed only through getters/setters with validation
- **Composition (has-a)** : `Customer` has an `ArrayList<Account>` — one customer can own many accounts
- **Exception Handling** : Custom checked exception `InsufficientBalanceException` thrown and caught with try-catch

---

## 📁 Project Structure

```
bank-management-system/
├── Main.java                              # Menu-driven console app
└── model/
    ├── Account.java                       # Abstract parent class
    ├── SavingsAccount.java                # Min balance + withdrawal limit rules
    ├── CurrentAccount.java                # Overdraft facility
    ├── Customer.java                      # Customer with multiple accounts
    └── InsufficientBalanceException.java  # Custom exception
```

---

## 🖥️ Sample Output

```
===== BANK MENU =====
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. Add Interest
6. Display All Accounts
7. Exit
Enter choice: 3
Account number: S001
Amount: 4500
Error: Withdrawal denied! Minimum balance of 1000.0 must be maintained.
```

The same `withdraw()` call on a Current account allows the balance to go
negative up to the overdraft limit — **runtime polymorphism in action**.

---

## 🔮 Future Enhancements

- [ ] Bank class to manage customers and transfers between accounts
- [ ] File handling / JDBC (MySQL) for data persistence
- [ ] PIN-based login system
- [ ] Fixed Deposit account type

## ⚙️ How to Run

```bash
javac model/*.java Main.java
java Main
```
---

⭐ If you found this project helpful, consider giving it a star!
