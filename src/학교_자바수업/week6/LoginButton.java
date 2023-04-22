package 학교_자바수업.week6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButton extends JFrame {
    public LoginButton() {
        setTitle("로그인");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 3));

        JLabel labelId = new JLabel("아이디", JLabel.RIGHT);
        JLabel labelPw = new JLabel("비밀번호", JLabel.RIGHT);
        JTextField inputId = new JTextField(8);
        JTextField inputPw = new JTextField(8);
        JCheckBox storeId = new JCheckBox("아이디 저장", true);
        JButton idBtn = new JButton("로그인");
        JButton cancelBtn = new JButton("취소");

        // 간단한 로그인 기능(?) 구현 아이디 비번 1234 1234
        idBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = inputId.getText();
                String pw = inputPw.getText();

                if (id.equals("1234") && pw.equals("1234")) {
                    dispose(); // 로그인 창 닫기
                    new EmptyWindow().setVisible(true); // 빈 창 띄우기
                } else {
                    JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 틀렸습니다.");
                }
            }
        });

        // 취소 버튼 클릭 시 처리
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

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

    // 빈 창 클래스
    class EmptyWindow extends JFrame {
        public EmptyWindow() {
            setTitle("빈 창");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(300, 200);
        }

    }

    public static void main(String[] args) {
        (new LoginButton()).setVisible(true);
    }
}
