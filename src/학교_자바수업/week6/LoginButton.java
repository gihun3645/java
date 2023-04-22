package 학교_자바수업.week6;


import javax.swing.*;
import java.awt.*;

public class LoginButton extends JFrame {
    public LoginButton() {
        setTitle("로그인");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cPane = getContentPane();

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.add(new JLabel("아이디"));
        panel1.add(new JTextField(10));
        panel2.add(new JLabel("비밀번호"));
        panel2.add(new JTextField(10));
        panel3.add(new JButton("로그인"));
        panel3.add(new Checkbox("ID저장"));

        cPane.add(panel1, BorderLayout.NORTH);
        cPane.add(panel2, BorderLayout.CENTER);
        cPane.add(panel3, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        (new LoginButton()).setVisible(true);
    }
}