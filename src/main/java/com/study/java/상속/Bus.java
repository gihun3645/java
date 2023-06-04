package com.study.java.상속;

// Bus는 자동차의 한 종류다. (상속은 일반화 시키거나 확장하는 개념을 갖고 있다.)
public class Bus extends Car{

    // 메소드를 오버라이딩(부모가 가진 메소드와 똑같은 메소드)
    // 버스는 후륜 구동으로 달린다고 오버라이딩
    public void run() {
        System.out.println("후륜 구동으로 달린다.");
    }
    public void 안내방송() {
        System.out.println("안내방송");
    }
}
