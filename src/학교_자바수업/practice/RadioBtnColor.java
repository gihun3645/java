package 학교_자바수업.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioBtnColor extends JFrame {
    private JRadioButton red, green, blue;
    private Color color;


    // 라디오 버튼 반응 리스너
    private class RadioListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getItem() == red)
                color = Color.red;
            else if (e.getItem() == red)
                color = Color.green;
            else if (e.getItem() == blue)
                color = Color.blue;

            repaint();
        }
    }

    // paint 메소드
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        g.fillOval(50, 80, 200, 200);
    }

    // 생성자
    public RadioBtnColor() {
        setSize(300, 350);
        setTitle("라디오 버튼 색상 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        red = new JRadioButton("Red");
        green = new JRadioButton("Green");
        blue = new JRadioButton("Blue");
        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(green);
        group.add(blue);
        RadioListener listener = new RadioListener();
        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);

        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        cPane.add(red);
        cPane.add(green);
        cPane.add(blue);
    }

    public static void main(String[] args) {
        (new RadioBtnColor()).setVisible(true);
    }
}
