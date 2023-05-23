package 학교_자바수업.practice;

public class BankAccount {
    protected String name;
    protected int balance;

    // 생성자
    public BankAccount(String name, int balance) {
        // this는 인스턴스 변수(필드)를 가리킴
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public String getName() {
        return name;
    }

    public void writeInfo() {
        System.out.printf("\n예금주: %s\n", name);
        // ,는 천 단위로 쉼표를 넣는 로케일 특화(localization) 옵션
        System.out.printf("잔액: %,d원\n", balance);
    }
}
