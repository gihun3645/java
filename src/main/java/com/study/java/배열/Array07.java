package com.study.java.배열;

public class Array07 {
    public static void main(String[] args) {
        double[] array = {1.3, 1.5, 1.6};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
//        System.out.println(array[3]); // ArrayIndexOutOfBoundsException

        double[] array2 = new double[0];
        System.out.println(array2.length); // 0
//        System.out.println(array2[0]); // ArrayIndexOutOfBoundsException
    }
}
