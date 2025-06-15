# Bank Management System

---

## 🏦 Overview
Bank Management System is a Java-based desktop application simulating an ATM interface, built with Java Swing and MySQL. It allows users to perform banking operations such as account creation, login, deposits, withdrawals, balance enquiries, and mini-statement generation. The application features a user-friendly GUI and robust database integration for managing user and transaction data.

### Key Highlights:
- Secure user authentication with card number and PIN.
- Supports core banking transactions like deposit, withdrawal, and balance enquiry.
- Generates mini-statements showing recent transactions.
- Integrates with MySQL for persistent data storage.
- Intuitive ATM-like interface with Java Swing.

---

## 🚀 Features
- **User Authentication**  
  Allows users to log in with a card number and PIN or sign up with personal and account details, including account type and services.

- **Deposit and Withdrawal**  
  Enables users to deposit or withdraw money, with input validation and balance checks to prevent overdrafts.

- **Balance Enquiry**  
  Displays the current account balance based on transaction history stored in the database.

- **Mini-Statement**  
  Generates a statement showing recent transactions, card number (partially masked), and total balance.

- **Database Integration**  
  Uses MySQL to store user details, account information, and transaction records, accessed via JDBC.

- **User-Friendly Interface**  
  Built with Java Swing, featuring an ATM-like GUI with buttons, text fields, and background images.

---

## 📈 Impact
- Simulates real-world ATM functionality for educational and demonstration purposes.
- Enhances understanding of Java GUI development and database integration.
- Provides a secure and reliable platform for managing banking transactions.

---

## 🛠 Tech Stack
| **Category**         | **Technology**          |
|-----------------------|-------------------------|
| **Language**         | Java                   |
| **GUI Framework**    | Java Swing             |
| **Database**         | MySQL                  |
| **Database Connector** | JDBC (MySQL Connector/J) |
| **Calendar Component** | JDateChooser           |

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- MySQL Server installed and running
- MySQL Connector/J library (JDBC driver)
- JDateChooser library (`com.toedter.calendar`)

---

### Installation
1. Clone the repository:
  ```bash
  git clone <repository-url>
  cd bank-management-system

```
Set up the MySQL database:
Create a database named bankmanagementsystem:
sql



CREATE DATABASE bankmanagementsystem;
Create the required tables (login, signup, signup3, bank). Example schema:
sql
```


CREATE TABLE login (
  formno VARCHAR(20),
  card_number VARCHAR(16),
  pin VARCHAR(4)
);
CREATE TABLE signup (
  formno VARCHAR(20),
  name VARCHAR(50),
  fname VARCHAR(50),
  dob VARCHAR(20),
  gender VARCHAR(10),
  email VARCHAR(50),
  marital VARCHAR(20),
  address VARCHAR(100),
  city VARCHAR(50),
  pincode VARCHAR(10),
  state VARCHAR(50)
);
CREATE TABLE signup3 (
  formno VARCHAR(20),
  account_type VARCHAR(50),
  card_number VARCHAR(16),
  pin VARCHAR(4),
  facility VARCHAR(100)
);
CREATE TABLE bank (
  pin VARCHAR(4),
  date VARCHAR(50),
  type VARCHAR(20),
  amount VARCHAR(20)
);
```
Update the database credentials in Conn.java if different from root/root.
Add dependencies:
Download MySQL Connector/J (e.g., mysql-connector-java-8.0.XX.jar) and add it to your project’s classpath.
Download JDateChooser (e.g., jcalendar-1.4.jar) and add it to your project’s classpath.
In NetBeans, right-click the project > Properties > Libraries > Add JAR/Folder to include these JARs.
Update image paths:
Replace hardcoded image paths in BalanceEnquiry.java, Deposit.java, Login.java, Transaction.java, and Withdraw.java (e.g., C:\\Users\\sudha\\...\\atm2.jpg) with the paths to your local image files (e.g., atm.jpg, atm2.jpg).
Running the Application
Compile and run the application:
bash

```
javac -cp .;path/to/mysql-connector-java.jar;path/to/jcalendar.jar bank/management/system/*.java
java -cp .;path/to/mysql-connector-java.jar;path/to/jcalendar.jar bank.management.system.Login
```
The login window will open. Use an existing card number and PIN or sign up to create a new account.
🌳 Environment
Ensure MySQL Server is running.
Update Conn.java with your MySQL credentials:
java

c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "your-username", "your-password");
Place required images (atm.jpg, atm2.jpg) in the specified paths or update the paths in the code.
# 🤝 Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure your code follows Java coding standards and includes appropriate comments.
