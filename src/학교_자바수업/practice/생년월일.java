package 학교_자바수업.practice;

import javax.swing.*;

public class 생년월일 {
    public static void main(String[] args) {
        String birthString = JOptionPane.showInputDialog("생년월일을 6자리를 입력 하세요.(YYMMDD)");
        // 단 2000년 이전의 생년월일만 고려

        int birthYear = Integer.parseInt(birthString.substring(0, 2));
        int birthMonth = Integer.parseInt(birthString.substring(2, 4));
        int birthDay = Integer.parseInt(birthString.substring(4, 6));

        // 결과 출력
        JOptionPane.showMessageDialog(null, "생일 " + birthYear + "년 " + birthMonth + "월 " + birthDay + "일");
    }
}
