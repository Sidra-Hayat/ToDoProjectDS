package todo;

public class TaskLinkedList {
    private class Node {
        Task data;
        Node next;
        Node(Task data) { this.data = data; }
    }

    private Node head;

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

    // Return an array for GUI
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

    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}