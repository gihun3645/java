package 학교_자바수업.practice;

public class Exam {
    public static void main(String[] args) {
        C obj = new C();
    }
}
    class A {
        public int a;
        public A() {
            this.a = 0;
            System.out.println("A의 생성자가 실행됨.");
        }
    }

    class B extends A {
        public int b;
        public B() {
            this.b = 1;
            System.out.println("B의 생성자가 실행됨.");
        }
    }

    class C extends B {
        public int c;
        public C() {
            this.c = 2;
            System.out.println("C의 생성자가 실행됨");
        }
    }



