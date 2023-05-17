package 학교_자바수업.practice;

import javax.swing.*;
import java.awt.*;

public class ConcentricCircle  extends JFrame {

    public void paint(Graphics g) {
        // 가운데에 검은색으로 칠한 원을 그린다.
        g.setColor(Color.BLACK);
        g.fillOval(250, 250, 50, 50);
        // 검은색으로 칠한 원 바깥으로 일정한 간격으로 검은 테두리 원 4개를 그린다.
        g.setColor(Color.BLACK);
        g.drawOval(200, 200, 150, 150);
        g.drawOval(175, 175, 200, 200);
        g.drawOval(150, 150, 250, 250);
        g.drawOval(125, 125, 300, 300);
    }

    public static void main(String[] args) {
        ConcentricCircle circle = new ConcentricCircle();
        circle.setTitle("ConcentricCircle");
        circle.setSize(500, 500);
        circle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        circle.setVisible(true);
    }
}
