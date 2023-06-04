package com.study.java.예외처리;

public class Exception4 {
    public static void main(String[] args) {
        int[] array = {4,2};
        int[] value = new int[1];
        try{
            value[0] = array[0] / array[1];
            // 특정 예외들
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println(aiob.toString());
        } catch (ArithmeticException ae) {
            System.out.printf(ae.toString());
            // 미쳐 모르는 Exception
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
