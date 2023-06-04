package com.study.java.학교_자바수업.week4;

import javax.swing.*;
import java.awt.*;

public class RectangleArea extends JFrame {


    // 와 잘했다 내 자신!

    public RectangleArea() {
        // 숫자를 입력 받는다
        String inputDialog = JOptionPane.showInputDialog("사각형의 가로 세로의 길이를 입력하세요.");

        // 입력 받은 문자열을 "x"를 기준으로 가로와 세로로 분리한다
        String[] sizeArr = inputDialog.split("x");
        int width = Integer.parseInt(sizeArr[0]);
        int height = Integer.parseInt(sizeArr[1]);

        // 윈도우 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width + 100, height + 100);

        // 프레임 내용창을 얻음
        Container cPane = getContentPane();

        JPanel panel = new JPanel() {
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillRect(50, 50, width, height);
                g.setColor(Color.black);
                g.setFont(new Font("Serif", 10, 18));
                g.drawString(width + "x" + height, 50, 70);
            }
        };
        cPane.add(panel);

    }
}
