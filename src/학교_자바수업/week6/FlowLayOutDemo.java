package 학교_자바수업.week6;

import javax.swing.*;
import java.awt.*;

public class FlowLayOutDemo extends JFrame {
    public FlowLayOutDemo() {
        setTitle("FlowLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        cPane.add(makePanel(Color.RED));
        cPane.add(makePanel(Color.ORANGE));
        cPane.add(makePanel(Color.YELLOW));
        cPane.add(makePanel(Color.GREEN));
        cPane.add(makePanel(Color.CYAN));
        cPane.add(makePanel(Color.BLACK));
        cPane.add(makePanel(Color.MAGENTA));
        pack();
    }

    private static JPanel makePanel(Color color) {
        JPanel panel = new JPanel();

        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {
        (new FlowLayOutDemo()).setVisible(true);
    }
}
