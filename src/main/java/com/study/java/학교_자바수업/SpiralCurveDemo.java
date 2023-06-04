package com.study.java.학교_자바수업;

import javax.swing.*;

public class SpiralCurveDemo {
    public static void main(String[] args) {
        SpiralCurve spiral = new SpiralCurve();
        spiral.setSize(500, 500);
        spiral.setTitle("Spiral Curve");
        spiral.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spiral.setVisible(true);
    }
}
