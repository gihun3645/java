package com.study.java.학교_자바수업.week12;

import java.awt.*;

public abstract class MyShape {
    protected int x, y;

    public MyShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class MyRect implements Measurable {
    private int width, height;

    public MyRect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width*height);
    }
}

class MyCircle  implements Measurable{
    public static final double PI = 3.14159;
    private int radius;

    public MyCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    public int getDiameter() {
        return 2*radius;
    }
}