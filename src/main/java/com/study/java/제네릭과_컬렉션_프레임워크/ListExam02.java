package com.study.java.제네릭과_컬렉션_프레임워크;

import java.util.ArrayList;

public class ListExam02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
