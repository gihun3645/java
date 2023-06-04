package com.study.java.제네릭과_컬렉션_프레임워크;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        // Map은 hashcode euals를 내장하고 있음
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
//        map.put("k3", "안녕하세요"); // 같은 키값이 있으면 덮어 씌움

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));
    }
}
