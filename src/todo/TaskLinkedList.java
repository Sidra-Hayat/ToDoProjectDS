package todo;

public class TaskLinkedList {
    private class Node {
        Task data;
        Node next;
        Node(Task data) { this.data = data; }
    }
    private Node head;

    // Add task at end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    // Delete by title (first matching only)
    public boolean deleteTask(String title) {
        if (head == null) return false;
        if (head.data.getTitle().equals(title)) {
            head = head.next;
            return true;
        }
        Node temp = head;
        while (temp.next != null && !temp.next.data.getTitle().equals(title)) {
            temp = temp.next;
        }
        if (temp.next == null) return false;
        temp.next = temp.next.next;
        return true;
    }

    // Mark completed by title (first matching only)
    public boolean markTaskCompleted(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getTitle().equals(title)) {
                temp.data.setCompleted(true);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Get all tasks as array for GUI
    public Task[] getAll() {
        int size = getSize();
        Task[] arr = new Task[size];
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            arr[idx++] = temp.data;
            temp = temp.next;
        }
        return arr;
    }

    // Count tasks
    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // *** Delete all completed tasks ***
    public void deleteAllCompletedTasks() {
        // Remove completed nodes from the beginning
        while (head != null && head.data.isCompleted()) head = head.next;
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.isCompleted()) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }
}