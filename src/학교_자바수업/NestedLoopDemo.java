package 학교_자바수업;

import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("한 자리의 정수를 입력하세요");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.println(i);
            System.out.println();
        }
    }
}
