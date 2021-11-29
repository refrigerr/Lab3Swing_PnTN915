package oknologowania;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyFrame extends JFrame {

    private final List<User> list = new ArrayList<>();

    MyFrame(){

        list.add(new User("login","haslo"));
        list.add(new User("Maciek","cztery4"));
        list.add(new User("rumak","SS3wD"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(475,275);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setBounds(0,0,475,275);
        panel.setLayout(null);
        this.add(panel);

        JLabel loginLabel = new JLabel();
        loginLabel.setText("Login");
        loginLabel.setBounds(50,50,100,30);
        panel.add(loginLabel);
        loginLabel.setVisible(true);

        JTextField loginField = new JTextField();
        loginField.setBounds(100, 50,300,30);
        panel.add(loginField);
        loginField.setVisible(true);

        JLabel passwordLabel = new JLabel();
        passwordLabel.setText("Password");
        passwordLabel.setBounds(25,100,100,30);
        panel.add(passwordLabel);
        passwordLabel.setVisible(true);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 100,300,30);
        panel.add(passwordField);
        passwordField.setVisible(true);

        JButton loginButton = new JButton("Login in");
        loginButton.setBounds(280,150,120,50);
        loginButton.setText("Login in");
        loginButton.setFocusable(false);
        panel.add(loginButton);
        loginButton.setVisible(true);
        loginButton.addActionListener(e ->{
            for (User user: list) {
                if(user.getLogin().equals(loginField.getText())&&user.getPassword().equals(passwordField.getText())){
                    panel.setBackground(Color.green);
                    break;
                }else panel.setBackground(Color.red);

            }
        });
        JButton resetButton = new JButton();
        resetButton.setBounds(50,150,120,50);
        resetButton.setText("Reset");
        resetButton.setFocusable(false);
        panel.add(resetButton);
        resetButton.setVisible(true);
        resetButton.addActionListener(e-> {
            passwordField.setText("");
            loginField.setText("");
            panel.setBackground(Color.CYAN);
        });
        this.setVisible(true);
    }
}
