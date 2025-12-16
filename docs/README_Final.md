# ToDo List Manager – Data Structures Project (Final)

## Project Summary
This project is a Java Swing based ToDo List Manager developed as part of the Data Structures course.  
It demonstrates the practical implementation of multiple data structures in a real-world application.

The system allows users to add, delete, update, search, and manage tasks efficiently using a clean graphical user interface.

## Data Structures Used
- **LinkedList<Task>** – Maintains the main list of tasks in insertion order
- **Stack<Task>** – Handles urgent tasks using LIFO (Last In, First Out)
- **ArrayList<Task>** – Stores completed tasks
- **HashMap<String, Task>** – Enables fast task lookup using unique task IDs
- **HashMap<String, List<Task>>** – Supports searching tasks by title

## Key Features
- Add new tasks with title, description, and priority
- Edit existing tasks
- Delete tasks safely using unique IDs
- Search tasks by title or description
- Mark tasks as completed
- Sort tasks based on priority (High to Low)
- Push and pop urgent tasks using stack
- Persistent storage using file serialization
- Login authentication system
- User-friendly and responsive GUI

## How to Run the Project
1. Open the project in any Java IDE (IntelliJ IDEA, NetBeans, or Eclipse)
2. Ensure JDK 8 or higher is installed
3. Run the `TaskManagerGUI.java` file
4. Login using:
   - **Username:** lara  
   - **Password:** lara123

## Project Structure
