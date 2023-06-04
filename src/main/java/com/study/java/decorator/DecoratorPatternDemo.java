package com.study.java.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DecoratorPatternDemo {
    public static void main(String[] args) throws Exception{
        Circle circle = new Circle();

//        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
//        redShapeDecorator.draw();;
//
//        GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(redShapeDecorator);
//        greenShapeDecorator.draw();

        Shape shape = new GreenShapeDecorator(new RedShapeDecorator(new Rectangle()));
        shape.draw();

        // Shape ==> InputStream (추상 클래스)
        // Rectangle ==> FileInputStream
        // RedShapeStreamDecorator ==> DataInputStream
        InputStream in = new DataInputStream(new FileInputStream("a.txt"));
    }
}
