package 학교_자바수업.practice;

public class SavingsAccount extends BankAccount {
    private double intRate;

    public SavingsAccount(String name, int balance, double intRate) {
        super(name, balance);
        this.intRate = intRate;
    }

    public void setIntRate(double newRate) {
        this.intRate = newRate;
    }

    public double getIntRate() {
        return this.intRate;
    }

    public void writeInfo() {
//        super.writeInfo();
        System.out.printf("이율: %.2f%%", intRate); // 슈퍼 클래스의 맴버가 protect일 때 접근가능
        System.out.printf("잔액: %,d원", balance);
        System.out.printf("예금주: %s", name);
    }
}
