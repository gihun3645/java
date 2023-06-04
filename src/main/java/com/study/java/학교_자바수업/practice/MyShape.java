package com.study.java.학교_자바수업.practice;


import javax.swing.*;
import java.awt.*;

public class MyShape {
    // private 로 선언하려면, 아래와 같이 접근자 메소드를 정의하여 사용해야한다.
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }

    protected int x, y;

    public MyShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {}
}

class MyRect extends MyShape {
    private int width, height;

    // 생성자
    public MyRect(int x, int y, int width, int height) {
        super(x, y);
        this.width = width; this.height = height;
    }

    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}

class MyCircle extends MyShape {
    private int radius;

    public MyCircle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
    }
    static class ShapeTest extends JFrame {
        private MyShape[] shapes;

        public ShapeTest() {
            setSize(400, 300);
            // 창을 닫으면 프로그램이 종료
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            shapes = new MyShape[3];
            shapes[0] = new MyRect(50, 50, 200, 150);
            shapes[1] = new MyCircle(200, 180, 100);
            shapes[2] = new MyRect(200, 100, 150, 150);
        }

        @Override
        public void paint(Graphics g) {
            // 부모 클래스의 paint 메서드를 실행
            super.paint(g);
            // shapes 배열에 저장된 도형들을 그림
            for (MyShape shape : shapes) {
                shape.draw(g);
            }
        }


    }
}



