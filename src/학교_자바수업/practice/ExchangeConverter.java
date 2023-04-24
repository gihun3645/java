package 학교_자바수업.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeConverter {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.print("환전할 금액을 입력하세요. (달러는 D 또는 d로, 엔은 Y 또는 y로, 유로는 E 또는 e로, 위안은 C 또는 c로 입력하세요. 종료하려면 quit 또는 exit 입력): ");
                // 금액 입력 받기
                String input = br.readLine();

                if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                // 숫자와 화폐단위를 분리
                String num = input.substring(0, input.length() - 1).trim();
                char letter = input.charAt(input.length() - 1);

                // 환율 계산
                if (letter == 'D' || letter == 'd') {
                    // 달러를 원으로 변환
                    int result = (int) Math.round(Integer.parseInt(num) * 1300);
                    System.out.println(num + "달러는 " + result + "원입니다.");
                } else if (letter == 'Y' || letter == 'y') {
                    // 엔을 원으로 변환
                    int result = (int) Math.round(Integer.parseInt(num) * 10);
                    System.out.println(num + "엔은 " + result + "원입니다.");
                } else if (letter == 'E' || letter == 'e') {
                    // 유로를 원으로 변환
                    int result = (int) Math.round(Integer.parseInt(num) * 1450);
                    System.out.println(num + "유로는 " + result + "원입니다.");
                } else if (letter == 'C' || letter == 'c') {
                    // 위안화를 원으로 변경
                    int result = (int) Math.round(Integer.parseInt(num) * 190);
                    System.out.println(num + "위안은 " + result + "원입니다.");
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
