package com.study.java.제네릭과_컬렉션_프레임워크;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        // 정렬
        Collections.sort(list);

        for(int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
