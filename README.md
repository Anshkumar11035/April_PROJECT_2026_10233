# 🏧 Automated Teller Machine (ATM) Simulation

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Principles-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

A robust, console-based Java application that simulates the core functionalities of a real-world ATM. This project focuses on implementing **Object-Oriented Programming (OOP)** principles to ensure secure data handling and an interactive user experience.

---

## 🎯 Project Overview
This simulation provides a secure gateway for users to manage their bank accounts. It emphasizes **Encapsulation** to protect financial data and **Exception Handling** to ensure system stability against invalid user inputs.

### ✨ Key Features
* **Secure Authentication:** PIN-based login system using static verification.
* **Real-time Transactions:** Perform withdrawals and check account balances instantly.
* **Data Protection:** Account balances are kept private using OOP encapsulation.
* **Crash-Proof Logic:** Robust `try-catch` blocks to handle non-numeric inputs and logic errors.
* **Interactive Menu:** A persistent loop-based interface for a seamless user session.

---

## 🛠️ System Architecture
The project is built on two primary classes:

1.  **`Account` Class:** Manages the balance, handles the math for withdrawals, and enforces business rules (e.g., no negative withdrawals).
2.  **`ATM` Class:** Handles the User Interface (UI), manages the static PIN, and controls the program flow.

---

## 🚀 Challenges & Solutions

| Challenge | How I Overcame It |
| :--- | :--- |
| **Data Security:** Preventing direct modification of the account balance from the main class. | Implemented **Encapsulation** by making the balance variable `private` and providing controlled `getter` and `setter` methods. |
| **Input Vulnerability:** Users entering text or symbols where numbers were expected, causing crashes. | Wrapped all scanner inputs in **Try-Catch blocks** and used `Integer.parseInt()` to validate data before processing. |
| **Logical Overdrafts:** Preventing users from withdrawing more money than they actually have. | Created a custom validation check within the `withdraw()` method that throws an exception if `amount > balance`. |

---

## 💡 Learnings
Through the development of this project, I gained deep insights into:
* **Modular Design:** How to split responsibilities between different classes to make code maintainable.
* **State Management:** Tracking variables across a loop-driven session.
* **User Experience (UX):** Designing a console menu that is intuitive and provides clear error feedback.
* **Java Fundamentals:** Strengthening my grasp on static variables, access modifiers, and the Java Collections logic.

---

## 💻 System Requirements
* **Hardware:** Minimum 4GB RAM.
* **Software:** Java JDK 8 or higher.
* **IDE:** VS Code, IntelliJ IDEA, or Eclipse.
