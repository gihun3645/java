package com.study.java.학교_자바수업.week6;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo extends JFrame {

    public ButtonDemo() {
        setSize(300, 100);
        setTitle("라디오 버튼 테스트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // 라디오 버튼
        JRadioButton button1 = new JRadioButton("라디오 버튼1", true);
        JRadioButton button2 = new JRadioButton("라디오 버튼2" );
        ButtonGroup group = new ButtonGroup();

        group.add(button1);
        group.add(button2);

        contentPane.add(button1);
        contentPane.add(button2);

        // 체크 박스
        Container contentPane1 = getContentPane();
        contentPane1.setLayout(new FlowLayout());

        JCheckBox check1 = new JCheckBox("체크박스1");
        JCheckBox check2 = new JCheckBox("체크박스2", true);
        contentPane1.add(check1);
        contentPane1.add(check2);
    }

    public static void main(String[] args) {
        (new ButtonDemo()).setVisible(true);
    }
}
