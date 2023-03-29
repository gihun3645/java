package 학교_자바수업.week4;

public class BankAccountTest {
    public static void main(String[] args) {
//        BankAccount account2 = new BankAccount();
        // 클래스 정의에 생성자가 하나라도 포함되면 디폴드 생성자가 자동생성되지 않음

        BankAccount account = new BankAccount("홍길동", 0);
        account.deposit(200000);
        account.writeInfo();

//        account2.setName("황진이");
//        account2.deposit(1000000);
//        account2.withdraw(400000);
//        account2.writeInfo();
    }
}
