package com.study.java.학교_자바수업.week5;

import javax.swing.*;

public class DiceGame extends JFrame {
    // 내가 작성한 코드
//    private int compsMove, yourMove;
//    int cnt = 1;
//
//    public void playGame() {
//        String input = JOptionPane.showInputDialog("주사위의 값(1-6)을 입력하시오.");
//        compsMove = (int) (Math.random() * 6) + 1;
//        yourMove = -1;
//        yourMove = Integer.parseInt(input);
//        while (yourMove < 1 || yourMove > 6) {
//        }
//        while (!findWinner()) {
//            input = JOptionPane.showInputDialog("다시 입력하세요.");
//            yourMove = Integer.parseInt(input);
//            cnt++;
//        }
//    }
//
//    public boolean findWinner() {
//        if (compsMove != yourMove) {
//            return false;
//        } else {
//            JOptionPane.showMessageDialog(null, "축하합니다 " + cnt + "번에 맞췄습니다.");
//            return true;
//        }
//    }
//
//    public static void main(String[] args) {
//        DiceGame game = new DiceGame();
//        game.playGame();
//    }

    // 교수님이 작성한 코드

    public static void main(String[] args) {
        int comGuess = (int) (Math.random() * 6) + 1;
        int userGuess = Integer.parseInt(JOptionPane.showInputDialog("주사위의 값(1-6)을 입력하시오."));
        int count = 1;
        while(userGuess != comGuess) {
            userGuess = Integer.parseInt(JOptionPane.showInputDialog("틀렸습니다. 다시 입력하시오"));
            count++;
        }
        JOptionPane.showInputDialog(null, "축하합니다. "+count+" 번만에 맞추셨습니다!");
    }

}
