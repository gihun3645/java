package 학교_자바수업;

import java.util.Scanner;

public class 온도계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("변환할 온도를 입력하시오(섭씨는 온도 위에 c나 C로, 화씨는 f나 F로)");
        // 섭씨 <--> 화씨
        // 섭씨온도 = (화씨온도-32)%1.8, 화씨온도=섭씨온도x1.8+32


        String input = sc.nextLine();

        // 이걸로 환율 계산기도 만들어 보자!
        // 온도와 문자를 분리
        String temp = input.substring(0, input.length() - 1).trim();
        char letter = input.charAt(input.length() - 1);

        if(letter == 'C' || letter == 'c') {
            // 화씨로 변환
            int result = (int) Math.round(Integer.parseInt(temp)*1.8 + 32);
            System.out.println("섭씨 "+temp+"는 "+"화씨 "+result+"입니다.");
        } else if (letter == 'F' || letter == 'f') {
            int result = (int) Math.round((Integer.parseInt(temp)-32)%1.8);
            System.out.println("화씨 "+temp+"는 "+"섭씨 "+result+"입니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
