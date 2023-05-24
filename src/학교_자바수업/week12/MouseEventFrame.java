package 학교_자바수업.week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventFrame extends JFrame {

    private class MyPanel extends JPanel {
        private Point[] points;
        private int count = 0;

        public MyPanel() {
            points = new Point[100];

            this.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (count < points.length)
                        points[count++] = new Point(e.getX(), e.getY());
                        System.out.println(points);
                        System.out.println(count);
                    repaint();
                }
                public void mousePressed(MouseEvent e) {}
                public void mouseReleased(MouseEvent e) {}
                public void mouseEntered(MouseEvent e) {}
                public void mouseExited(MouseEvent e) {}
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

    public MouseEventFrame() {
        super();
        setSize(400, 300);
        setTitle("마우스선 그리기 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new MyPanel());
    }

    public static void main(String[] args) {
        (new MouseEventFrame()).setVisible(true);
    }
}
