package 학교_자바수업.week11;

import java.awt.Graphics;
import javax.swing.JFrame;

public class ShapeFrameTest extends JFrame {
    private MyShape[] shapes;

    public ShapeFrameTest() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shapes = new MyShape[3];
        shapes[0] = new MyRect(50, 50, 200, 150);
        shapes[1] = new MyCircle(200, 180, 100);
        shapes[2] = new MyRect(200, 100, 150, 150);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (MyShape s : shapes) {
            s.draw(g); // 다형성
        }
    }

    public static void main(String[] args) {
        new ShapeFrameTest().setVisible(true);
    }
}
