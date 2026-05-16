# ToDo List Manager – Data Structures Project (Final)

## Project Summary
This project is a **Java Swing-based ToDo List Manager** developed as part of the Data Structures course. It demonstrates the practical implementation of multiple data structures in a real-world application.

The system allows users to add, delete, update, search, and manage tasks efficiently using a clean, intuitive graphical user interface (GUI).

## 📊 Data Structures Used
- **LinkedList<Task>** – Maintains the main list of tasks in insertion order
- **Stack<Task>** – Handles urgent tasks using LIFO (Last In, First Out) principle
- **ArrayList<Task>** – Stores completed tasks for efficient retrieval
- **HashMap<String, Task>** – Enables O(1) fast task lookup using unique task IDs
- **HashMap<String, List<Task>>** – Supports efficient searching of tasks by title

## ✨ Key Features
- ✅ Add new tasks with title, description, and priority levels
- ✅ Edit existing tasks with real-time updates
- ✅ Delete tasks safely using unique IDs
- ✅ Search tasks by title or description
- ✅ Mark tasks as completed and track progress
- ✅ Sort tasks based on priority (High → Low)
- ✅ Push and pop urgent tasks using stack operations
- ✅ Persistent storage using file serialization
- ✅ Login authentication system for user security
- ✅ User-friendly and responsive GUI

## 🚀 How to Run the Project

### Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- **Java IDE** (IntelliJ IDEA, NetBeans, or Eclipse)

### Steps
1. Clone or download the project repository
2. Open the project in your preferred Java IDE
3. Ensure JDK 8+ is configured in the project settings
4. Locate and run `TaskManagerGUI.java` file
5. Login using the default credentials:
   - **Username:** `lara`
   - **Password:** `lara123`

## 📁 Project Structure

```
ToDoProjectDS/
├── src/
│   ├── TaskManagerGUI.java       # Main GUI application class
│   ├── Task.java                 # Task data model class
│   ├── TaskManager.java          # Core business logic
│   └── AuthenticationSystem.java  # Login authentication
├── docs/
│   └── README_Final.md           # Project documentation (this file)
└── resources/
    └── tasks.dat                 # Serialized task storage
```

## 🔧 Technical Details

### Technology Stack
- **Language:** Java
- **GUI Framework:** Java Swing
- **Data Persistence:** File Serialization
- **Design Pattern:** MVC (Model-View-Controller)

### Time Complexity Analysis
- **Add Task:** O(1) – Direct insertion to LinkedList
- **Search by ID:** O(1) – HashMap lookup
- **Search by Title:** O(n) – Linear search through HashMap values
- **Delete Task:** O(n) – Search + remove operation
- **Sort Tasks:** O(n log n) – Comparator-based sorting

## 📝 Usage Guide

### Adding a Task
1. Click the **"Add Task"** button
2. Enter task title, description, and select priority level
3. Click **"Save"** to add the task

### Searching Tasks
1. Use the **search bar** at the top
2. Enter keyword from task title or description
3. Results update in real-time

### Managing Urgent Tasks
1. Click **"Push to Stack"** to add task to urgent queue
2. Click **"Pop from Stack"** to remove urgent task
3. Stack follows LIFO principle

### Completing Tasks
1. Select a task from the list
2. Click **"Mark as Complete"**
3. Task moves to completed tasks list

## 🎓 Learning Outcomes

This project demonstrates:
- Implementation of multiple data structures from scratch
- Practical application of each data structure's strengths
- GUI development using Java Swing
- File I/O and serialization concepts
- Authentication and user management
- Software design principles (encapsulation, abstraction)

## 🔐 Security Notes
- Default login credentials are for demonstration purposes
- For production use, implement password hashing and encryption
- Consider adding role-based access control

## 🐛 Known Limitations
- Single-user session (concurrent access not supported)
- No cloud synchronization
- Task data stored locally in serialized format only

## 🚀 Future Enhancements
- Multi-user support with database backend
- Cloud synchronization
- Mobile app companion
- Task categories and tags
- Due date reminders and notifications
- Export to CSV/PDF formats
- Dark mode UI theme

## 📄 License
This project is developed as an educational assignment for the Data Structures course.

## 👤 Author
**Sidra Hayat**  
GitHub: [@Sidra-Hayat](https://github.com/Sidra-Hayat)

## 💬 Questions or Feedback?
If you have any questions or suggestions for improvement, feel free to open an issue or contact the author.

---

**Last Updated:** May 16, 2026
