package 학교_자바수업;

import javax.swing.*;
import java.awt.*;

public class SpiralCurve extends JFrame {
    // 이름 상수 선언
    // final이 붙여서 뒤의 변수가 변하지 못함
    // C언어의 전기처리랑 비슷한건가..

    private static final int XINTY = 250;
    private static final int YINTY = 250;
    private static final int K = 4;
    private static final int NUMOFPOINTS = 500;
    private static final double DELTA = 0.1;

    public void paint(Graphics g) {
        g.setColor(Color.CYAN);

        int xOld = XINTY, yOld = YINTY, xNew, yNew;
        double t = 0.0;
        for(int i=0; i<NUMOFPOINTS; i++) {
            xNew = (int) (XINTY + K * t * Math.cos(t));
            yNew = (int) (YINTY + K * t * Math.sin(t));
            g.drawLine(xOld, yOld, xNew, yNew);
            xOld = xNew;
            yOld = yNew;
            t += DELTA;
        }
    }
}
