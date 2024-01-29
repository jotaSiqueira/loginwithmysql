package guis;

import javax.swing.*;

//Class responsable for all the Project GUI config
public class Form extends JFrame {
    public Form(String title) {
        super(title);
        setSize(520, 680);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }
}
