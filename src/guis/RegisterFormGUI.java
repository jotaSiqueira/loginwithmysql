package guis;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class RegisterFormGUI extends Form {

    public RegisterFormGUI() {
        super("Register");
        addGuiComponents();
    }

    private void addGuiComponents() {

        JLabel registerLabel = new JLabel("Register");

        registerLabel.setBounds(0,25,520,100);

        registerLabel.setForeground(CommonConstants.PRIMARY_COLOR);

        registerLabel.setFont(new Font("Dialog", Font.BOLD, 40));

        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(registerLabel);

        //username label
        JLabel usernameLabel = new JLabel("Username");

        usernameLabel.setBounds(30,25,520,300);

        usernameLabel.setForeground(CommonConstants.PRIMARY_COLOR);

        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        add(usernameLabel);


        //username text field
        JTextField usernameField = new JTextField();

        usernameField.setBounds(30,210,450,55);

        usernameField.setForeground(CommonConstants.PRIMARY_COLOR);

        usernameField.setBackground(CommonConstants.SECUNDARY_COLOR);

        usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(usernameField);

        //password label

        JLabel passwordLabel = new JLabel("Password");

        passwordLabel.setBounds(30, 265, 450, 55);

        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        passwordLabel.setForeground(CommonConstants.PRIMARY_COLOR);

        add(passwordLabel);

        //password text field

        JPasswordField passwordField = new JPasswordField();

        passwordField.setBounds(30, 310, 450, 55);

        passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));

        passwordField.setBackground(CommonConstants.SECUNDARY_COLOR);

        add(passwordField);

        //password confirmation label

        JLabel passwordConfirmationLabel = new JLabel("Confirm Password");

        passwordConfirmationLabel.setBounds(30, 370, 450, 55);

        passwordConfirmationLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        passwordConfirmationLabel.setForeground(CommonConstants.PRIMARY_COLOR);

        add(passwordConfirmationLabel);

        //password confirmation text field

        JPasswordField passwordConfirmField = new JPasswordField();

        passwordConfirmField.setBounds(30, 420, 450, 55);

        passwordConfirmField.setFont(new Font("Dialog", Font.PLAIN, 18));

        passwordConfirmField.setBackground(CommonConstants.SECUNDARY_COLOR);

        add(passwordConfirmField);


        //login button

        JButton registerButton = new JButton("Register");

        registerButton.setBounds(190, 500, 150, 55);

        registerButton.setFont(new Font("Dialog", Font.PLAIN, 18));

        registerButton.setForeground(CommonConstants.PRIMARY_COLOR);

        registerButton.setBackground(CommonConstants.SECUNDARY_COLOR);

        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(registerButton);

        //back to login area
        //register area
        JLabel backToLogin = new JLabel("Back to Login");
        backToLogin.setHorizontalAlignment(SwingConstants.CENTER);
        backToLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backToLogin.setForeground(CommonConstants.PRIMARY_COLOR);
        backToLogin.setBounds(125,600,250,30);

        add(backToLogin);
    }
}
