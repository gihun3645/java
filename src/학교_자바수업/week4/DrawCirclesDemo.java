package 학교_자바수업.week4;

import javax.swing.*;

public class DrawCirclesDemo {
    public static void main(String[] args) {
        DrawCircles draw = new DrawCircles();
        draw.setSize(500, 500);
        draw.setTitle("색상원 그리기");
        draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw.setVisible(true);
    }
}
