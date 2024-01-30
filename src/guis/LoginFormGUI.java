package guis;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginFormGUI extends Form{
    public LoginFormGUI() {
        super("Login");
        addGuiComponents();
    }

    private void addGuiComponents() {

        JLabel loginLabel = new JLabel("LogiN");

        loginLabel.setBounds(0,25,520,100);

        loginLabel.setForeground(CommonConstants.PRIMARY_COLOR);

        loginLabel.setFont(new Font("Dialog", Font.BOLD, 40));

        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(loginLabel);

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

        passwordLabel.setBounds(30, 300, 450, 55);

        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        passwordLabel.setForeground(CommonConstants.PRIMARY_COLOR);

        add(passwordLabel);

        //password text field

        JPasswordField passwordField = new JPasswordField();

        passwordField.setBounds(30, 350, 450, 55);

        passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));

        passwordField.setBackground(CommonConstants.SECUNDARY_COLOR);

        add(passwordField);


        //login button

        JButton button = new JButton("Login");

        button.setBounds(190, 450, 150, 55);

        button.setFont(new Font("Dialog", Font.PLAIN, 18));

        button.setForeground(CommonConstants.PRIMARY_COLOR);

        button.setBackground(CommonConstants.SECUNDARY_COLOR);

        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(button);

        //register area
        JLabel registerLabel = new JLabel("Register");
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerLabel.setForeground(CommonConstants.PRIMARY_COLOR);
        registerLabel.setBounds(125,600,250,30);

        add(registerLabel);

        // functionality that when clicked it will launch the register area
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginFormGUI.this.dispose();

                new RegisterFormGUI().setVisible(true);
            }
        });
    }
}
