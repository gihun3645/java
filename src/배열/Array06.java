package 배열;

public class Array06 {
    public static void main(String[] args) {
        double[] array1 = new double[5];
        double[] array2 = {1.5, 2.4, 3.5};
        double[] array3; // array3 = null 과 동일
        double[] array4 = null;

        System.out.println(array1.length); // 5
        System.out.println(array2.length); // 3
        // double형은 0을 넣게된다
        System.out.println(array1[0]); // 0.0
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        // array3,4 는 nullPointException
    }
}
