package 학교_자바수업.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JButton btnLogin;
    private JButton btnCancel;
    private JTextField inputId;
    private JPasswordField inputPasswd;
    private JCheckBox storedId;

    public LoginFrame() {
        setTitle("Login Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 3));
        LoginListener listener =  new LoginListener();

        JLabel labelID = new JLabel("아이디", JLabel.RIGHT);
        JLabel labelPasswd = new JLabel("비밀번호", JLabel.RIGHT);
        inputId = new JTextField(8);
        inputPasswd = new JPasswordField(8);

        storedId = new JCheckBox("아이디 저장", true);
        btnLogin = new JButton("로그인");
        btnCancel = new JButton("취소");
        btnLogin.addActionListener(listener);
        btnCancel.addActionListener(listener);

        panel.add(labelID);
        panel.add(inputId);
        panel.add(labelPasswd);
        panel.add(inputPasswd);
        panel.add(new JLabel());
        panel.add(storedId);
        panel.add(btnLogin);
        panel.add(btnCancel);
        add(panel);
        pack();
    }


    public class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnLogin) {
                String id = inputId.getText();
                String passwd = new String(inputPasswd.getPassword());
                if (id.equals("test") && passwd.equals("1234")) {
                    String msg = "id=" + id + ", passwd=" + passwd
                            + ", store ID" + (storedId.isSelected() ? true : false);
                    (new LoginResultFrame(msg)).setVisible(true);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인하세요!");
                    inputPasswd.setText("");
                    inputId.selectAll();
                    inputId.requestFocus(true);
                }
            } else if (e.getSource() == btnCancel) {
                inputId.setText("");
                inputPasswd.setText("");
                inputId.requestFocus(true);
            }
        }
    }

    public static void main(String[] args) {
        (new LoginFrame()).setVisible(true);
    }

    public class LoginResultFrame extends JFrame {

        public LoginResultFrame(String msg) {
            setSize(400, 200);
            setTitle("Login Result");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            JLabel label = new JLabel("Welcome to Login Example!!",
                    SwingConstants.CENTER);
            label.setFont(new Font("SansSerif", Font.BOLD, 26));
            label.setForeground(Color.BLUE);
            JLabel msgLabel = new JLabel(msg);
            msgLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

            Container container = getContentPane();
            container.setLayout(new FlowLayout());
            container.add(label);
            container.add(msgLabel);
        }
    }
}
