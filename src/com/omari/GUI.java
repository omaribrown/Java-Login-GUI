package com.omari;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel pwLabel;
    private static JPasswordField pwText;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

         userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

         userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

         pwLabel = new JLabel("Password");
        pwLabel.setBounds(10, 50, 80, 25);
        panel.add(pwLabel);

         pwText = new JPasswordField(20);
        pwText.setBounds(100, 50, 165, 25);
        panel.add(pwText);

         button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = pwText.getText();

        if(user.equals("omari") && password.equals("brown")) {
            success.setText("Login Successful.");
        } else {
            success.setText("Incorrect. Try again.");
        }
    }
}
