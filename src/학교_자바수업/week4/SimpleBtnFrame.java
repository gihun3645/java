package 학교_자바수업.week4;

import javax.swing.*;
import java.awt.*;

public class SimpleBtnFrame extends JFrame {
    // UI 를 만드는 메서드는 paint를 쓰지 않음
    public SimpleBtnFrame() {
        setSize(450, 150);
        setTitle("YES/NO BUTTON EXAMPLE");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 프레임의 내용창을 얻음
        Container cPane = getContentPane();
        // 내용창의 배경색 설정
        cPane.setBackground(Color.green);
        // 내용창의 배치관리자 지정
        // - 배치 관리자 : 컨테이너 내에서 컴포넌트들의 크기와 위치 지정
        cPane.setLayout(new FlowLayout());
        cPane.add(new JButton("YES"));
        cPane.add(new JButton("NO"));
        JLabel label = new JLabel("정보를 보내시겠습니까?");
        label.setFont(new Font("Serif", Font.BOLD, 30));
        label.setForeground(Color.BLUE);
        cPane.add(label);

        // 왜 위치를 하지 않는건가요 ㅠㅠ
    }
}
