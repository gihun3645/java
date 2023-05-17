package 학교_자바수업.practice;

import java.util.Scanner;

public class Aver_Sum {
    public static void main(String[] args) {
        // 3개의 정수를 읽어
        Scanner sc = new Scanner(System.in);

        // 배열 3개를 만듬
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        // 합계
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i];
        }
        // 출력
        System.out.println("합계: " + sum);

        // 평균
        double average = sum / 3.0;
        // 소수 둘째자리까지 출력
        System.out.println("평균: " + String.format("%.2f", average));
    }
}
