package todo;

import javax.swing.*;

public class TaskManagerGUI extends JFrame {
    private TaskLinkedList taskList = new TaskLinkedList();
    private DefaultListModel<Task> listModel = new DefaultListModel<>();
    private JList<Task> taskJList = new JList<>(listModel);

    public TaskManagerGUI() {
        setTitle("ToDo List Manager");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane(taskJList);
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TaskManagerGUI();
    }
}