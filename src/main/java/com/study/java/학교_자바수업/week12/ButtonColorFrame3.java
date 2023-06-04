package com.study.java.학교_자바수업.week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColorFrame3 extends JFrame{
    private JRadioButton yellow;
    private JRadioButton green;

    public ButtonColorFrame3() {
        setSize(300, 350);
        setTitle("버튼 색상 무명 클래스 방식");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        yellow = new JRadioButton("노란색");
        green = new JRadioButton("연두색");

        JButton button = new JButton("변경");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yellow.isSelected())
                    (getContentPane()).setBackground(Color.YELLOW);
                else if (green.isSelected())
                    (getContentPane()).setBackground(Color.GREEN);
            }
        });

        cPane.add(yellow);
        cPane.add(green);
        cPane.add(button);
    }

    public static void main(String[] args) {
        (new ButtonColorFrame3()).setVisible(true);
    }
}