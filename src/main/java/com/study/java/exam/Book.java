package com.study.java.exam;

public class Book { // Book 클래스
    private String title; // title field (속성)
    private int price; // price field

    // 아무것도 안하는 기본 생성자가 있어야함 why?
    public Book() {

    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
