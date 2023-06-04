package com.study.java.학교_자바수업.week5;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("홍길동", 20000);
        BankAccount acc2 = new BankAccount("김길동", 20000);
        int value = 10000;

        acc1.transfer(value, acc2);
        acc1.WriteInfo();
        acc2.WriteInfo();

        System.out.println("입금 후");
        acc1.deposit(value);
        acc1.WriteInfo();

        System.out.println("개설된 계좌의 수는"+BankAccount.numberOfAccounts+"입니다.");
    }
}
