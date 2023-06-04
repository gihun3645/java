package com.study.java.javaIO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {
    public static void main(String[] args) throws Exception{
        OutputStream out = new FileOutputStream("/tmp/helloio01.dat");
        out.write(1); // 0000 0000      0000 0000       0000 0000       0000 0001
        out.write(255);
        out.write(0);
        out.close();
    }
}
