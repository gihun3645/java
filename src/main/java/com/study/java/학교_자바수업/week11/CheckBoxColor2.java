package com.study.java.학교_자바수업.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxColor2 extends JFrame {
    private JCheckBox red, green, blue;
    private JLabel message;

    public CheckBoxColor2() {
        setSize(300, 350);
        setTitle("CheckBox Color Example2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        red = new JCheckBox("Red");
        red.setBorderPainted(true);
        green = new JCheckBox("Green");
        green.setBorderPainted(true);
        blue = new JCheckBox("Blue");
        blue.setBorderPainted(true);

        CheckBoxListener listener = new CheckBoxListener();
        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);
        message = new JLabel("", SwingConstants.CENTER);

        JPanel panel = new JPanel();
        panel.add(red);
        panel.add(green);
        panel.add(blue);
        Container cPane = getContentPane();
        cPane.setLayout(new BorderLayout());
        cPane.add(panel, "North");
        cPane.add(message, "South");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int rCheck = red.isSelected() ? 1 : 0;
        int gCheck = green.isSelected() ? 1 : 0;
        int bCheck = blue.isSelected() ? 1 : 0;
        g.setColor(new Color(rCheck * 255, gCheck * 255, bCheck * 255));
        g.fillOval(50, 80, 200, 200);
    }

    private class CheckBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            String item = ((JCheckBox) e.getItem()).getText();
            if (e.getStateChange() == ItemEvent.SELECTED)
                message.setText(item + " is selected");
            else
                message.setText(item + " is cleared");
            repaint();
        }
    }

    public static void main(String[] args) {
        new CheckBoxColor2().setVisible(true);
    }
}
