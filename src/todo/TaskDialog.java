package todo;

import javax.swing.*;
import java.awt.*;

public class TaskDialog extends JDialog {
    private JTextField titleField = new JTextField(20);
    private JTextArea descArea = new JTextArea(5, 20);
    private JComboBox<String> priorityBox = new JComboBox<>(new String[]{"High", "Medium", "Low"});
    private JButton saveBtn = new JButton("Save");
    private Task task = null;

    // For Add
    public TaskDialog(Frame owner) {
        super(owner, "Task Info", true);
        setupUI();
    }

    // For Edit
    public TaskDialog(Frame owner, Task existingTask) {
        super(owner, "Edit Task", true);
        setupUI();
        if (existingTask != null) {
            titleField.setText(existingTask.getTitle());
            descArea.setText(existingTask.getDescription());
            priorityBox.setSelectedItem(existingTask.getPriority());
        }
    }

    private void setupUI() {
        setLayout(new BorderLayout());

        JPanel fields = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        fields.add(new JLabel("Title:"), gbc);
        gbc.gridx = 1;
        fields.add(titleField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        fields.add(new JLabel("Description:"), gbc);
        gbc.gridx = 1;
        JScrollPane descScroll = new JScrollPane(descArea);
        fields.add(descScroll, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        fields.add(new JLabel("Priority:"), gbc);
        gbc.gridx = 1;
        fields.add(priorityBox, gbc);

        add(fields, BorderLayout.CENTER);
        add(saveBtn, BorderLayout.SOUTH);

        saveBtn.addActionListener(e -> saveTask());

        pack();
        setLocationRelativeTo(getOwner());
    }

    private void saveTask() {
        String title = titleField.getText().trim();
        String desc = descArea.getText().trim();
        String priority = (String) priorityBox.getSelectedItem();
        if (!title.isEmpty()) {
            task = new Task(title, desc, priority);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Title is required.");
        }
    }

    public Task getTask() {
        return task;
    }
}