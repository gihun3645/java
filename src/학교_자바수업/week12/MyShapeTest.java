package 학교_자바수업.week12;

public class MyShapeTest {
    public static void main(String[] args) {
        MyRect rect = new MyRect(20, 15);
        System.out.println(rect.getArea());
        MyCircle circle = new MyCircle(22);
        System.out.println(circle.getPerimeter());
    }
}
