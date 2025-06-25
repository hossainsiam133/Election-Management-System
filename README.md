# 🗳️ Election Management System

A Java-based desktop application designed to digitize and streamline the election process with a focus on transparency, efficiency, and security. The system is built using **Java Swing** for the GUI and **MySQL** for the backend database.

---

## 📌 Features

### 🧑‍💼 Admin Panel:
- Admin login with authentication
- Create, edit, delete elections
- Manage candidate records with photos
- Manage voter records and assign elections
- View results and generate reports
- Real-time vote counting and result publishing

### 👤 Voter Panel:
- Voter registration with eligibility verification
- Secure login
- View election details
- Cast vote (only once per election)
- See voting status and results

---

## 🔐 Security Features
- Authentication & authorization for both admin and voters
- Duplicate voting prevention
- Encrypted login and secure data transactions
- Database-level integrity checks

---

## 🧰 Technology Stack
- **Language:** Java  
- **GUI Framework:** Java Swing  
- **Database:** MySQL  
- **IDE:** NetBeans / IntelliJ IDEA / VS Code  
- **Database Connector:** JDBC

---

## 📂 Project Structure

ElectionManagementSystem/ <br>
├── src/<br>
│ ├── EMS.java<br>
│ ├── Splash.java<br>
│ ├── Login.java<br>
│ ├── MainMenu.java<br>
│ ├── Elections.java<br>
│ ├── Candidates.java<br>
│ ├── Voters.java<br>
│ ├── Voting.java<br>
│ └── DashBoard.java<br>
├── resources/<br>
│ └── icons, images, and database config<br>
├── README.md<br>
└── electiondb.sql<br>

---

## 🏁 How to Run

1. **Clone or Download** the project.
2. **Create MySQL Database**:
   - Import `electiondb.sql` to your MySQL server.
3. **Configure JDBC URL** in the code if necessary:
   ```java
   jdbc:mysql://localhost:3306/electiondb
   username: root
   password: (blank or your MySQL password)
4. Run EMS.java from your IDE to start the system.

## 👨‍🎓 Developed By
Md. Siam Hossain <br>
Dept. of CSE, R.P. Shaha University<br>
Semester: Fall 2024<br>

Supervisor:<br>
Dr. Kingkar Prosad Ghosh<br>

## 📌 Conclusion
<p align = "justify">The Election Management System revolutionizes traditional voting by offering a secure, transparent, and user-friendly digital platform. It automates the entire process from voter registration to result publication while preventing fraud and ensuring data accuracy. </p>

---

Let me know if you want this saved as a downloadable file or customized for online deployment!

