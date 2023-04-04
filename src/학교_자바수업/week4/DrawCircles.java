package 학교_자바수업.week4;

import javax.swing.*;
import java.awt.*;

public class DrawCircles extends JFrame {

    // 시작 위치
    private static final int X = 50;
    private static final int Y = 50;
    private static final int CIRCLE_SIZE_INCREMENT = 15;
    private static final int TOTAL_NUM_OF_CIRCLES = 20;
    private static final Color[] COLORS = {Color.RED, Color.GREEN, Color.BLUE};

    private JPanel panel;

    public DrawCircles() {
        panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                int x = X, y = Y;
                int colorIndex = 0;
                for (int i = 1; i <= TOTAL_NUM_OF_CIRCLES; i++) {
                    g.setColor(COLORS[colorIndex]);
                    g.fillOval(x, y, i * CIRCLE_SIZE_INCREMENT, i * CIRCLE_SIZE_INCREMENT);
                    x += 5;
                    y += 5;
                    colorIndex = (colorIndex + 1) % COLORS.length;
                }
            }
        };
        add(panel);
    }
}
