package todo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskManagerGUI extends JFrame {

    private CardLayout cardLayout;
    private JPanel loginPanel, mainPanel;
    private JTextField userField = new JTextField(16);
    private JPasswordField passField = new JPasswordField(16);
    private JButton loginBtn = new JButton("Login");

    public TaskManagerGUI() {
        super("ToDo List Manager");

        // Nimbus Theme
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 550);
        setLocationRelativeTo(null);
        cardLayout = new CardLayout();
        setLayout(cardLayout);

        // Logo Prep
        ImageIcon rawIcon = new ImageIcon(getClass().getResource("/icons/app_icon.png"));
        Image scaledImage = rawIcon.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(scaledImage));
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        // Login Panel with LEFT/RIGHT split
        loginPanel = new JPanel(new BorderLayout());
        loginPanel.setBackground(new Color(28, 40, 51));

        JPanel leftLogoPanel = new JPanel(new GridBagLayout());
        leftLogoPanel.setBackground(new Color(28, 40, 51));
        leftLogoPanel.add(logoLabel);

        JPanel rightLoginPanel = new JPanel();
        rightLoginPanel.setLayout(new BoxLayout(rightLoginPanel, BoxLayout.Y_AXIS));
        rightLoginPanel.setBackground(new Color(44, 62, 80));

        JLabel appNameLabel = new JLabel("ToDo List Manager");
        appNameLabel.setFont(new Font("SansSerif", Font.BOLD, 34)); // font fallback
        appNameLabel.setForeground(new Color(255, 255, 255));
        appNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        appNameLabel.setBorder(BorderFactory.createEmptyBorder(38, 0, 18, 0));

        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new GridBagLayout());
        fieldsPanel.setBackground(new Color(44, 62, 80));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(16, 16, 16, 16);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel userLbl = new JLabel("Username:");
        userLbl.setForeground(new Color(236, 240, 241));
        userLbl.setFont(new Font("SansSerif", Font.BOLD, 20));

        JLabel passLbl = new JLabel("Password:");
        passLbl.setForeground(new Color(236, 240, 241));
        passLbl.setFont(new Font("SansSerif", Font.BOLD, 20));

        userField.setFont(new Font("SansSerif", Font.PLAIN, 20));
        passField.setFont(new Font("SansSerif", Font.PLAIN, 20));
        userField.setMaximumSize(new Dimension(220, 38));
        passField.setMaximumSize(new Dimension(220, 38));
        loginBtn.setFont(new Font("SansSerif", Font.BOLD, 22));
        loginBtn.setBackground(new Color(39, 174, 96));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);

        gbc.gridx = 0; gbc.gridy = 0;
        fieldsPanel.add(userLbl, gbc);
        gbc.gridx = 1;
        fieldsPanel.add(userField, gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        fieldsPanel.add(passLbl, gbc);
        gbc.gridx = 1;
        fieldsPanel.add(passField, gbc);
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2; gbc.anchor = GridBagConstraints.CENTER;
        fieldsPanel.add(loginBtn, gbc);

        rightLoginPanel.add(appNameLabel);
        rightLoginPanel.add(fieldsPanel);
        rightLoginPanel.setBorder(BorderFactory.createEmptyBorder(0, 18, 0, 32));

        loginPanel.add(leftLogoPanel, BorderLayout.WEST);
        loginPanel.add(rightLoginPanel, BorderLayout.CENTER);

        mainPanel = new JPanel(); // Placeholder, replace with your actual mainPanel

        add(loginPanel, "login");
        add(mainPanel, "main");

        loginBtn.addActionListener(e -> attemptLogin());
        getRootPane().setDefaultButton(loginBtn);

        cardLayout.show(getContentPane(), "login");
        setVisible(true);
    }

    private void attemptLogin() {
        String username = userField.getText().trim();
        String password = new String(passField.getPassword());
        if (username.equals("lara") && password.equals("lara123")) {
            cardLayout.show(getContentPane(), "main");
            // call refreshTaskList() as needed!
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            userField.setText("");
            passField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TaskManagerGUI::new);
    }
}