package 학교_자바수업.week11;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class BookListFrame extends JFrame {
    private JList listBox;
    private JTextArea infoMsg;

    private class BookListListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting() == false) {
                Book book = (Book) listBox.getSelectedValue();
                infoMsg.setText(book.getFullInfo());
            }
        }
    }

    public BookListFrame() {
        setTitle("Book List Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Book[] list = new Book[5];
        list[0] = new Book("벌레 이야기", "이청준", "영화밀양의 원작인 이청준의 소설");
        list[1] = new Book("셜록 홈즈", "코난 도일", "동명의 이름을 주인공으로 한 아서 코난 도일의 추리 소설");
        list[2] = new Book("프로그래머로 사는 법", "샘 라이트스톤", "프로그매로 경력을 시작하는데 필요한 정보가 모두 담겨 있다.");
        list[3] = new Book("채식주의자", "한강", "2016년 맨부커상 수상작인 소설");
        list[4] = new Book("Charlie and the Chocolate Factory", "Roald Dahl", "윌리 윌카의 초콜릿 공장에선 금박종이를 찾을 사람을 공장으로 초대하고...");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        listBox = new JList(list);
        listBox.addListSelectionListener(new BookListListener());
        panel.add(listBox);

        infoMsg = new JTextArea(5, 30);
        infoMsg.setEditable(false);
        infoMsg.setLineWrap(true);
        infoMsg.setBackground(Color.LIGHT_GRAY);
        infoMsg.setForeground(Color.BLUE);
        infoMsg.setFont(new Font("SansSerif", Font.BOLD, 14));
        infoMsg.setText("도서를 선택하세요!");
        panel.add(infoMsg);

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        add(panel);
        pack();
    }

    public static void main(String[] args) {
        (new BookListFrame()).setVisible(true);
    }
}
