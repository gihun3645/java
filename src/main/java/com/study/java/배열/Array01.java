package com.study.java.배열;

public class Array01 {
    public static void main(String[] args) {
        int[] array1;
        int array2[];
        int array3[];

        array1 = new int[5];
        array2 = new int[5];
        // 아무것도 가질 수 없는 배열(길이가 0!)
        array3 = new int[0];

        System.out.println(array1.length); // 5
        System.out.println(array2.length); // 5
        System.out.println(array3.length); // 0
    }
}
