package com.study.java.학교_자바수업.week6;

import java.util.Scanner;

public class ArrMN {
    public static void main(String[] args) {
        // 정수의 개수인 n과 n개의 정수를 읽어 배열에 저장한 후 읽은 값들의 최대값, 최소값, 평균값을 출력하는 프로그램을 작성하라.
        System.out.println("정수의 개수를 입력하세요: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("n개의 양의 정수를 입력하시오 : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // 평균값 계산
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum / n;
        System.out.println("평균값: "+String.format("%.2f", average));

        // 최대값, 최소값 계산
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
