package guis;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

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
    }
}
