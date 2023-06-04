package com.study.java.학교_자바수업.week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework10 extends JFrame {
    private JButton[] buttons; // Declare the array of buttons

    public Homework10() {
        setTitle("Homework10");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        buttons = new JButton[16]; // 16개 버튼 만듬
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(String.valueOf(i+1));
            buttons[i].setOpaque(true);
            buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            buttons[i].setBackground(Color.WHITE);
            buttons[i].addActionListener(new ButtonClickListener());
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
        (new Homework10()).setVisible(true);
    }
}
