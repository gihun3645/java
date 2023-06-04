package com.study.java.학교_자바수업.week3;

import javax.swing.*;
import java.awt.*;

public class SpiralCurve2 extends JFrame {
    // 이름 상수 선언
    // final이 붙여서 뒤의 변수가 변하지 못함
    // C언어의 전기처리랑 비슷한건가..

    private static final int XINTY = 250;
    private static final int YINTY = 250;
    private static final int K = 4;
    private static final int NUMOFPOINTS = 500;
    private static final double DELTA = 0.1;

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.CYAN);
        g2.setFont(new Font("Serif", 40, 160));
        g2.drawString("Sprial", 40, 300);
        g2.setColor(new Color(255, 100, 100));
        g2.setStroke(new BasicStroke(5));

        int xOld = XINTY, yOld = YINTY, xNew, yNew;
        double t = 0.0;
        for(int i=0; i<NUMOFPOINTS; i++) {
            xNew = (int) (XINTY + K * t * Math.cos(t));
            yNew = (int) (YINTY + K * t * Math.sin(t));
            g.drawLine(xOld, yOld, xNew, yNew);
            xOld = xNew;
            yOld = yNew;
            t += DELTA;
        }
    }
}