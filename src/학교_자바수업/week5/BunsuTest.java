package 학교_자바수업.week5;

import java.util.Scanner;

public class BunsuTest {
    public static void main(String[] args) {
//        Bunsu b1 = new Bunsu(3, 5);
//        Bunsu b2 = new Bunsu(1, 2);
//        b1 = b1.times(b2);
//        System.out.println(b1.toString());
        Scanner input = new Scanner(System.in);
        System.out.println("첫 번째 분수의 분자와 분모는? ");
        Bunsu b1 = new Bunsu(input.nextInt(), input.nextInt());
        System.out.println("두 번째 분수의 분자와 분모는? ");
        Bunsu b2 = new Bunsu(input.nextInt(), input.nextInt());
        b1 = b1.plus(b2);
        b1 = b1.minus(b2);
        System.out.println("b1 = " + b1.toString());
    }
}
