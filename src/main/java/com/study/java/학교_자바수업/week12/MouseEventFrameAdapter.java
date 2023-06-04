package com.study.java.학교_자바수업.week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventFrameAdapter extends JFrame {

    private class MyPanel extends JPanel {
        private Point[] points;
        private int count = 0;

        public MyPanel() {
            points = new Point[100];

            // MouseListener를 구현(implement)하는 대신 MouseAdapter를 확장(extends)할 수 있다.
            this.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    points[count++] = new Point(e.getX(), e.getY());
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
            g2.setColor(Color.BLUE);
            for (int i = 0; i < count - 1; i++) {
                g2.drawLine(points[i].x, points[i].y, points[i + 1].x, points[i + 1].y);
            }
        }
    }

    public MouseEventFrameAdapter() {
        super();
        setSize(400, 300);
        setTitle("마우스선 그리기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new MyPanel());
    }

    public static void main(String[] args) {
        (new MouseEventFrameAdapter()).setVisible(true);
    }
}
