package com.study.java.javaIO;

import java.io.FileInputStream;
import java.io.InputStream;

public class HelloIO02 {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("/tmp/helloio01.dat");
//        int i1 = in.read();
//        System.out.println(i1); // 1
//        int i2 = in.read();
//        System.out.println(i2); // 255
//        int i3 = in.read();
//        System.out.println(i3); // 0
//        int i4 = in.read();
//        System.out.println(i4); // -1 (파일의 끝)
        int buf = -1;
        while((buf = in.read()) != -1) { // 더 이상 읽을게 없을 때
            System.out.println(buf);
        }
        in.close();
    }
}
