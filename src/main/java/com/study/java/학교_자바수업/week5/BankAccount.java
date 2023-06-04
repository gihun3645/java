package com.study.java.학교_자바수업.week5;

public class BankAccount {
    private String name;
    private int balance;
    public static int numberOfAccounts = 0;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
        numberOfAccounts++;
    }

    // 기본 생성자
    public BankAccount() {
        this("no name", 0);
    }

    public void WriteInfo() {
        System.out.println("예금주: " + name);
        System.out.println(", 잔액" + balance);
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void transfer(int amount, BankAccount otherAcc) {
        this.balance -= amount;
        otherAcc.balance += amount;
    }
}
