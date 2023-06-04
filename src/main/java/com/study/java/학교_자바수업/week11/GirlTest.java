package com.study.java.학교_자바수업.week11;

public class GirlTest {
    public static void main(String[] args) {
        Girl[] girls = {
                new Girl("영자"), new GoodGirl("정자"), new BestGirl("경자")
        };
        for (Girl g : girls)
            System.out.println(g.show());
    }
}
