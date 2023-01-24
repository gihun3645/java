package 예외처리;

public class Exception5 {
    public static void main(String[] args) {
        try {
            ExceptionObj5 exObj = new ExceptionObj5();
            int value = exObj.divide(10, 0);
            System.out.println(value);
        } catch (MyException ex) {
            System.out.println("사용자 정의 Exception이 발생했네요.");
        }
    }
}

class ExceptionObj5 {
    public int divide(int i, int k) throws MyException{
        int value = 0;
        try {
            value = 1 / k;
        } catch (ArithmeticException ex) {
            throw new MyException("0으로 나눌 수 없습니다.");
        }
        return value;
    }
}
