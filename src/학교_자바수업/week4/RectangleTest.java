package 학교_자바수업.week4;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 20;
        rect.height = 10;
        System.out.println("직사각형의 넓이는 = "+rect.getArea());
    }
}
