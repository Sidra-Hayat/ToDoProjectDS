# Operation Flow Explanation – To-Do List Manager

### Operation 1: Add New Task
- What it does: Allows the user to add a new task (title, description, date)
- Data Structure: Singly Linked List
- Why suitable: Supports fast insertion at the end and can grow dynamically
- User interaction: User enters task details → system creates a new node → node is linked at the end

### Operation 2: Delete Task
- What it does: Removes a task from the list by matching its title
- Data Structure: Singly Linked List
- Why suitable: Deletion is easy — just update previous node’s pointer
- User interaction: User selects a task to delete → system traverses → deletes node → updates list

### Operation 3: Search Task
- What it does: Finds a task by name or keyword
- Data Structure: Singly Linked List
- Why suitable: Tasks are few; sequential search is simple and efficient
- User interaction: User enters search keyword → list is traversed → matching tasks are shown

### Operation 4: Mark Completed
- What it does: Marks a task as done
- Data Structure: Singly Linked List
- Why suitable: Linear traversal allows finding task easily
- User interaction: User selects task → system updates completed status
