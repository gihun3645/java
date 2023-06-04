package com.study.java.학교_자바수업.week4;

public class Course {
    private String title;
    private Professor lecture;
    private Book textbook;

    public Course(String title, Professor lecture, Book textbook) {
        this.title = title;
        this.lecture = lecture;
        this.textbook = textbook;
    }

    public String toString() {
        return "과목명: "+title+", \n교수: "+lecture+", \n교재: "+textbook;
    }
}
