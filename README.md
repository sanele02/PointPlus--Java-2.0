# PointPlus--Java-2.0
# PointPlus Rewards Program System

## 📌 Overview

PointPlus is a **Java-based console rewards management system** designed to help **small and medium-sized enterprises (SMEs)** track customer spending, reward loyal customers, and gain meaningful insights into their markets.

The system was developed to address the lack of **affordable, simple rewards software** for small businesses, particularly in local and informal markets. It provides a lightweight alternative to expensive enterprise loyalty platforms while laying the foundation for a scalable, collaborative SME ecosystem.

---

## 💡 Project Motivation & Problem Statement

This project was inspired by a real-world problem observed in a **small cookie and baking business**.

The business struggled to:

* Keep track of individual customer spending
* Reward loyal customers consistently
* Identify repeat customers
* Run structured promotions

Most existing rewards systems are either **too expensive**, **too complex**, or designed exclusively for **large retail chains**. As a result, many SMEs operate without any loyalty system, limiting customer retention and business growth.

PointPlus was created to solve this problem by providing a **simple, accessible rewards application** that SMEs can realistically adopt.

---

## 🏪 SME-Focused Solution

PointPlus is designed specifically for SMEs and local businesses, offering:

* Simple customer registration using a phone number
* Automatic reward point calculation
* Store credit conversion from reward points
* Membership tiers to encourage repeat purchases
* A menu-driven interface that is easy to use

The system focuses on **practical business value** rather than unnecessary complexity.

---

## 📊 Market Insight & Business Intelligence Vision

Beyond rewards, PointPlus has the potential to provide **valuable market insights** to SMEs.

With wider adoption, the system could help businesses:

* Understand customer spending patterns
* Identify popular products and price ranges
* Track customer engagement over time
* Compare performance across regions

Unlike traditional systems that limit insights to a single store or town, PointPlus could enable SMEs to gain visibility into **broader market trends across the country**, helping small businesses make data-driven decisions.

---

## 🔗 Future Vision: Connected SMEs & Joint Promotions

PointPlus is designed with scalability in mind. In the future, it could evolve into a **shared rewards platform** where:

* Multiple SMEs participate in one rewards network
* Customers earn points across different businesses
* SMEs collaborate on joint promotions
* Local businesses strengthen their collective competitiveness

Example:

* Earn points at a bakery
* Redeem them at a coffee shop or local retailer

This approach enables SMEs to **compete with large corporations** by working together and sharing customer engagement tools.

---

## 🎯 Features

* Create a new customer account
* Log in using a registered phone number
* Earn reward points based on spending
* View reward point balance and store credit
* Convert points into store credit
* Automatic membership level calculation:

  * **Bronze**: Below 500 points
  * **Silver**: 500–999 points
  * **Gold**: 1000+ points
* Input validation for phone numbers and email addresses

---

## 🧩 System Structure

### Main Classes

| Class Name         | Description                                              |
| ------------------ | -------------------------------------------------------- |
| `Main`             | Application entry point and main menu                    |
| `PointPlusAccount` | Stores customer details, reward points, and store credit |
| `Login`            | Handles authentication and user menu                     |
| `MembershipLevel`  | Determines membership tier and manages point conversion  |

---

## 🛠️ Technologies Used

* Java (JDK 8 or later)
* Console-based input/output
* `ArrayList` for in-memory data storage
* `Scanner` for user input

---

## 🧪 Unit Testing

Unit testing was implemented to ensure the correctness and reliability of the system’s core logic.

### Tested Areas Include:

* Phone number validation
* Email address validation
* Reward point calculation logic
* Account lookup by phone number
* Membership level determination

### Purpose of Unit Testing:

* Ensure accurate business logic
* Prevent calculation errors
* Improve code quality and maintainability
* Prepare the system for future expansion

---

## ⚙️ How the Points System Works

* **Points earned:**

  * 1 point for every R5 spent

* **Points conversion:**

  * 100 points = R1.00 store credit

---

## ▶️ How to Run the Program

1. Ensure Java is installed on your system
2. Compile the program:

   ```bash
   javac Main.java
   ```
3. Run the application:

   ```bash
   java Main
   ```
4. Follow the on-screen menu instructions

---

## 🚧 Limitations

* Data is stored in memory only (no persistence after exit)
* No password authentication
* Console-based interface
* Designed as a prototype and proof of concept

---

## 🚀 Future Improvements

* Database integration for persistent storage
* Password-based authentication
* Transaction history and analytics
* Web or mobile interface
* Advanced reporting and dashboards
* SME network and joint promotion system

---

## 👤 Author

**Sanele Mhlanga**
* Software Development Student
* Java | Backend Development | SME-focused Solutions

---

## 📌 Conclusion

PointPlus demonstrates how software development can be used to solve **real-world SME challenges**, improve customer retention, and unlock market insights. The project lays the groundwork for a scalable rewards ecosystem that empowers small businesses to grow collaboratively.

