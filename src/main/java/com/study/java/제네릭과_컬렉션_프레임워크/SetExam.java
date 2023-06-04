package com.study.java.제네릭과_컬렉션_프레임워크;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean flag1 = set.add("hello");
        boolean flag2 = set.add("hi");
        boolean flag3 = set.add("hong");
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        set.add("hello");
        set.add("hi");
        set.add("hong");

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
