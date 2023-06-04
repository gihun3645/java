package com.study.java.상속;

public class ParentExam01 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("-----------------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("-----------------------");
        Parent p2 = new Child(); // Child는 Parent의 후손이다. 혹은 자식이다.
        System.out.println(p2.i);
        p2.printII(); // 필드는 부모타입을 따라감 i는 5임 근데 웬만하면 하지 말아야함
        p2.printI();
    }
}
