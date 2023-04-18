package 학교_자바수업.week3;

public class BankAccount {

    private String name; // 예금주
    private int balance = 0; // 잔액

    // 생성자
    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeInfo() {
        System.out.print("예금주 : " + name);
        System.out.println(", 잔액 : " + getBalance());
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
