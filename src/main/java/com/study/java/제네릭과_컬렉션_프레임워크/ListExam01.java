package com.study.java.제네릭과_컬렉션_프레임워크;

import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {
        // 자료구조 객체드른 제네릭을 사용하지 않으면
        // Object 타입을 저장합니다.
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = (String)list.get(0);
        String str2 = (String)list.get(1);
        String str3= (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
