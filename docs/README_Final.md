🗂️ ToDo List Manager – Data Structures Project
📌 Project Overview

The ToDo List Manager is a Java Swing-based desktop application developed as part of a Data Structures and Algorithms course project.

It demonstrates the practical implementation of core data structures in a real-world, event-driven application with a clean and modular GUI.

The system is designed using Object-Oriented Design principles and follows a lightweight MVC architecture for better maintainability and separation of concerns.

🧠 Core Data Structures Implemented
LinkedList – Maintains dynamic task storage with efficient insertions and deletions
Stack – Implements LIFO-based urgent task management system
ArrayList – Stores completed tasks for fast iteration and retrieval
HashMap<String, Task> – Provides O(1) task lookup using unique identifiers
HashMap-based indexing – Enables efficient keyword-based task searching
✨ Key Features

✔ Add, update, and delete tasks with real-time updates
✔ Priority-based task classification system
✔ Efficient task search using optimized in-memory indexing
✔ Stack-based urgent task handling (LIFO operations)
✔ Task completion tracking with history management
✔ Persistent storage using Java Serialization
✔ Secure login authentication system
✔ Responsive and user-friendly Java Swing GUI

⚙️ System Architecture
Architecture Style: MVC (Model-View-Controller)
Design Approach: Object-Oriented Modular Design
Data Handling: In-memory + file-based persistence
UI Layer: Java Swing event-driven interface
📊 Time Complexity Analysis
Add Task: O(1) – Direct insertion into LinkedList
Search by ID: O(1) – HashMap lookup
Search by Title: O(n) – Linear traversal of dataset
Delete Task: O(n) – Search + removal operation
Sort Tasks: O(n log n) – Comparator-based sorting
🚀 How to Run
Requirements:
Java JDK 8 or higher
IntelliJ IDEA / NetBeans / Eclipse
Steps:
Clone or download the repository
Open project in Java IDE
Configure JDK 8+
Run TaskManagerGUI.java
Default Login:
Username: lara
Password: lara123
🔐 Security Considerations
Default credentials are for development/testing only
Production systems should implement password hashing (BCrypt recommended)
Future improvements should include role-based access control (RBAC)
🐛 Limitations
Single-user desktop application (no concurrency support)
Local file-based persistence only
No cloud synchronization
No database integration
🚀 Future Enhancements
Multi-user authentication system
Database integration (MySQL / PostgreSQL)
Cloud-based task synchronization
Mobile companion application
Task categories, tags, and filtering system
Export functionality (PDF/CSV reports)
Dark mode UI theme
🎓 Key Learning Outcomes
Practical implementation of linear and non-linear data structures
Real-world application of algorithmic complexity concepts
Java Swing-based GUI development
File handling and serialization techniques
Secure authentication system design
Modular software architecture principles
👤 Author

Sidra Hayat
GitHub: @Sidra-Hayat

📌 Project Type

Academic Project – Data Structures & Algorithms
Focus: Real-world implementation of core CS concepts using Java
