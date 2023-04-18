package 학교_자바수업.week3;

public class Rectangle2Demo {
    public static void main(String[] args) {
        // 해당 클래스가 작동하려면 기본 생성자를 생성해야함
        Rectangle2 rec1 = new Rectangle2();
        rec1.setWidth(25);
        rec1.setHeight(20);
        System.out.println("rec1의 면적="+rec1.getArea());
        Rectangle2 rec2 = new Rectangle2(12, 15);
        rec2.setHeight(18);
        System.out.println("rec2의 면적="+rec2.getArea());
    }
}
