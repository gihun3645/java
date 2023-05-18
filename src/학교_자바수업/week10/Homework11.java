package 학교_자바수업.week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework11 extends JFrame {
    private JButton[] buttons; // Declare the array of buttons

    public Homework11() {
        setTitle("Homework11");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        buttons = new JButton[16]; // 16개 버튼 만듬
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(String.valueOf(i+1)); // Initialize each button
            buttons[i].setOpaque(true);
            buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            buttons[i].setBackground(Color.WHITE);
            buttons[i].addActionListener(new ButtonClickListener()); // Add a custom action listener to each button
            panel.add(buttons[i]);
        }

        add(panel);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            Color currentColor = button.getBackground();
            if (currentColor.equals(Color.WHITE)) {
                button.setBackground(Color.YELLOW);
            } else if (currentColor.equals(Color.YELLOW)) {
                button.setBackground(Color.WHITE);
            }
        }
    }

    public static void main(String[] args) {
        (new Homework11()).setVisible(true);
    }
}
