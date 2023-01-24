package 예외처리;

public class Exception2 {
    public static void main(String[] args) {
        ExceptionObj2 exObj = new ExceptionObj2();
        try {
            int value = exObj.divide(10, 0);
        } catch (ArithmeticException ex) {
            System.out.println("0으로 나눌 수 없어요");
        }
    }
}

class ExceptionObj2 {
    /**
     * i 를 k로 나눈 나머지를 반환한다.
     * @param i
     * @param k
     * @throws ArithmeticException
     * **/
    public int divide(int i, int k) throws ArithmeticException{
        int value = 0;
        value = i / k;
        return value;
    }
}