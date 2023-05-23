package 학교_자바수업.week10;

import org.jetbrains.annotations.NotNull;

public class Compatibility {

    public static void main(String[] args) {
        First obj1 = new Second(); // Okay
        ((Second) obj1).goo(); // 다운 케스팅 해야함
        Second obj2 = new Second();
        obj2.foo(); // 가능

        Test.func(obj1, obj2);
        Test.func(obj2, obj2);
//        Test.func(obj1, obj1); 안됨
        // 서브클래스 타입의 매개변수에 슈퍼클래스 객체를 인자로 넘기려고 하므로 타입에러가 남
    }
}
    class First {
        public void foo() {
            System.out.println("foo in First");
        }
    }

    class Second extends First {
        public void goo() {
            System.out.println("goo in second");
        }
    }

    class Test {
    public static void func(First objA, Second objB) {
        objA.foo();
        objB.goo();
    }
    }


