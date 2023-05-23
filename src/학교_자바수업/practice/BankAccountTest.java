package 학교_자바수업.practice;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("성기훈", 0);
        bankAccount.writeInfo();

        SavingsAccount savingsAccount = new SavingsAccount("새벽", 1200000, 2.5);
        savingsAccount.writeInfo();
    }
}
