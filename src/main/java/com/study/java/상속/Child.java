package com.study.java.상속;

public class Child extends Parent{
    int i = 15; // 필드에 대한 오버라이딩
    public void printI() { // 메소드에 대한 오버라이딩
        System.out.println("child - printI() : " + i);
    }
}
