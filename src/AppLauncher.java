import db.JDBC;
import guis.LoginFormGUI;

import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFormGUI().setVisible(true);

                System.out.println(JDBC.checkUser("usernamee"));
            }

        });

    };
}

