package 학교_자바수업.week5;

import java.util.Scanner;

public class GawiBawiBo {
    private int compsMove, yourMove;

    public void playGame() {
        Scanner input = new Scanner(System.in);
        do {
            compsMove = (int)(Math.random() * 3);
            yourMove = -1;
            while (yourMove < 0 || yourMove > 2) {
                System.out.print("가위(0), 바위(1), 보(2) >> ");
                yourMove = input.nextInt();
            }
        } while (!findWinner());
    }

    public boolean findWinner() {
        if (compsMove == yourMove) {
            System.out.println("you=" + getMoveStr(yourMove) + ", comp="
                    + getMoveStr(compsMove) + ", 비겼습니다. 다시 입력하세요." );
            return false;
        }
        else if ((compsMove+1) % 3 == yourMove) {
            System.out.println("you=" + getMoveStr(yourMove) + ", comp="
                    + getMoveStr(compsMove) + ", 귀하가 이겼습니다!" );
            return true;
        }
        else {
            System.out.println("you=" + getMoveStr(yourMove) + ", comp="
                    + getMoveStr(compsMove) + ", 귀하가 졌습니다!" );
            return true;
        }
    }

    private String getMoveStr(int move) {
        if (move == 0) return "가위";
        else if (move == 1) return "바위";
        else return "보";
    }

    public static void main(String[] args) {
        GawiBawiBo game = new GawiBawiBo();
        game.playGame();
    }
}
