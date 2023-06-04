package com.study.java.예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Exception3.java");
        } catch (FileNotFoundException ex) {
            System.out.println("파일을 받지 못했습니다.");
        }
    }
}
