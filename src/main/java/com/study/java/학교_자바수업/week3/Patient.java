package com.study.java.학교_자바수업.week3;

public class Patient {
    public double getBMI;
    private String name;
    private double height;
    private double weight;

    public Patient(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getBMI() {
        double heightInMeter = height / 100; // cm를 m로 변환
        System.out.println(heightInMeter);
        return weight / (heightInMeter * heightInMeter); // BMI 계산
    }
}
