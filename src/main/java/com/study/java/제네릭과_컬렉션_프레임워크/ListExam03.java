package com.study.java.제네릭과_컬렉션_프레임워크;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args) {
        // 참조하는 타입은 Collection, ArrayList는 Collection을 상속받기에 가능!
        Collection<String> collection = new ArrayList<>(); // Collection을 구현하고 있는 자료구조 구현가능
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        // collection은 get 메소드가 없음
        // collection이 ArrayList를 오버라이딩 했기 때문에 순서대로 ㅏ능

        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
