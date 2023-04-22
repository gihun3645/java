package 학교_자바수업.week6;


import javax.swing.*;
import java.awt.*;

public class LoginButton extends JFrame {
    public LoginButton() {
        setTitle("로그인");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,2,10,3));

        JLabel labelId = new JLabel("아이디", JLabel.RIGHT);
        JLabel labelPw = new JLabel("비밀번호", JLabel.RIGHT);
        JTextField inputId = new JTextField(8);
        JTextField inputPw = new JTextField(8);
        JCheckBox storeId = new JCheckBox("아이디 저장", true);
        JButton idBtn = new JButton("로그인");
        JButton cancelBtn = new JButton("취소");


        // 패널에 추가
        panel.add(labelId);
        panel.add(inputId);
        panel.add(labelPw);
        panel.add(inputPw);
        panel.add(new JLabel());
        panel.add(storeId);
        panel.add(idBtn);
        panel.add(cancelBtn);
        add(panel);

        //  JFrame의 크기를 자식 컴포넌트의 크기에 맞게 자동으로 조절해주는 메소드입니다.
        pack();
    }

    public static void main(String[] args) {
        (new LoginButton()).setVisible(true);
    }
}