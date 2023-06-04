package com.study.java.학교_자바수업.week10;

public class BankAccount {
    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void writeInfo() {
        System.out.printf("예금주: %s\n", name);
        System.out.printf("잔액: %,d원\n", balance);
    }


}
