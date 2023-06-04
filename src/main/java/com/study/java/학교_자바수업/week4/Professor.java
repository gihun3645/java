package com.study.java.학교_자바수업.week4;

public class Professor {
    private String name;
    private String dept;

    public Professor(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String toString() {
        return "교수명: "+name+", 학과: "+dept;
    }
}
