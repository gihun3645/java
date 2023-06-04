package com.study.java.학교_자바수업;

import java.util.Scanner;

public class NestedLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" 10미만의 정수를 입력하세요 : ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            // 공백 출력
            for(int j=n-1; j>=i; j--) {
                System.out.print(" ");
            }
            // 별 출력
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
