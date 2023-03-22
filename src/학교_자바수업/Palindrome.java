package 학교_자바수업;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("단어를  입력 하세요.");
            String word = sc.next();

            int length = word.length();
            boolean isPalin = true;
            // 문자가 맞지 않는 경우
            for (int i = 0, j = length - 1; i < j; i++, j--) {
                if (word.charAt(i) != word.charAt(j)) {
                    isPalin = false;
                     break;
                }
                System.out.println("\"" + word + "\" :");
                if (isPalin)
                    System.out.println("회문입니다.");
                else
                    System.out.println("회문이 아닙니다.");
            }
        }
    }
}
