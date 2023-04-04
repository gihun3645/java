package 학교_자바수업.week4;

import javax.swing.*;
import java.awt.*;

public class DrawCircles extends JFrame {

    // 시작 위치
    private static final double X = 50;
    private static final double Y = 50;
    // 증가 크기
    private static final double CIRCLE_SIZE_INCREMENT = 15;
    // 원의 개수
    private static final double TOTAL_NUM_OF_CIRCLES = 20;
    // 원의 시작 크기
    private static final double START_CIRCLE_SIZE = 3;
    // 색상
    private static final Color[] COLORS = {Color.RED, Color.GREEN, Color.BLUE};

    private JPanel panel;

    public DrawCircles() {
        panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                double x = X, y = Y;
                double colorIndex = 0;
                for (double i = START_CIRCLE_SIZE; i < (int)(TOTAL_NUM_OF_CIRCLES+START_CIRCLE_SIZE); i++) {
                    g.setColor(COLORS[(int) colorIndex]);
                    // 지정된 좌표(x, y)에서 JPanel에 채워진 타원을 그림
                    g.fillOval((int) x, (int) y, (int) (i * CIRCLE_SIZE_INCREMENT), (int) (i * CIRCLE_SIZE_INCREMENT));
                    // 루프를 반복할 때마다 고정된 양만큼 x 및 y 좌표를 증가시켜 원을 이동시킴
                    x += 5;
                    y += 5;
                    colorIndex = (colorIndex + 1) % COLORS.length;
                }
            }
        };
        //  DrawCircles 클래스의 JFrame 창에 panel 개체를 추가하는 메서드 호출
        add(panel);
    }
}
