package 예외처리;

public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exObj = new ExceptionObj1();
        int value = exObj.divide(10, 0);
        System.out.println(value);
    }
}

class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;
        try {
            value = 1 / k;
        } catch (ArithmeticException ex) {
            System.out.println("0으로 나눌 수 없어요");
            System.out.println(ex.toString());
        }
        return value;
    }
}
