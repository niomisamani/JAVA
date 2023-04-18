/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationFormSimple implements ActionListener {
  private JFrame frame;
  private JPanel panel;
  private JTextField nameField, emailField, passwordField;

  public RegistrationFormSimple() {
    frame = new JFrame("Registration Form");

    panel = new JPanel(new GridLayout(4, 2, 10, 10));
    frame.add(panel);

    JLabel nameLabel = new JLabel("Name:");
    panel.add(nameLabel);

    nameField = new JTextField(20);
    panel.add(nameField);

    JLabel emailLabel = new JLabel("Email:");
    panel.add(emailLabel);

    emailField = new JTextField(20);
    panel.add(emailField);

    JLabel passwordLabel = new JLabel("Password:");
    panel.add(passwordLabel);

    passwordField = new JPasswordField(20);
    panel.add(passwordField);

    JButton submitButton = new JButton("Submit");
    submitButton.addActionListener(this);
    panel.add(submitButton);

    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // handle button click event here
  }

  public static void main(String[] args) {
    new RegistrationFormSimple();
  }
}

