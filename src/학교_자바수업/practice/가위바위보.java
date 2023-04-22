package 학교_자바수업.practice;

import java.util.Scanner;

public class 가위바위보 {
    private int com, you;
// 방법 1
//    public void playGame() {
//        Scanner sc = new Scanner(System.in);
//        do {
//            com = (int) (Math.random() * 3); // 0, 1, 2 를 랜덤으로 반환
//            you = -1; // -1 로 설정한 이유는 무엇일까요?
//            while (you < 0 || you > 2) {
//                System.out.print("0:가위, 1: 바위, 2: 보");
//                you = sc.nextInt();
//            }
//        }
//        while (!findWinner());
//    }

//    private String getMove(int move) {
//        if (move == 0) return "가위";
//        else if (move == 1) return "바위";
//        else return "보"; // move == 2 일 때
//    }

    // switch 문으로도 가능!
//    private String getMove(int move) {
//        switch (move) {
//            case 0:
//                return "가위";
//            case 1:
//                return "바위";
//            case 2:
//                return "보";
//             // case 블록에 명시된 값이 아닌 값이 들어왔을 때 실행되는 블록입니다
//            default:
//                return "잘못된 입력입니다.";
//        }
//    }

//    private boolean findWinner() {
//        if (com == you) {
//            System.out.println("you=" + getMove(you) + ", comp="
//                    + getMove(com) + ", 비겼습니다. 다시 입력하세요." );
//            return false;
//        } else if((com + 1) % 3 == you) {
//            // 이걸 어케 생각해 내는지
//            // 0 : 가위 1 : 바위 2 : 보
//            // 이기는 조건
//            // com : you = 0 : 1, 1 : 2, 2 : 0
//            System.out.println("you=" + getMove(you) + ", comp="
//                    + getMove(com) + ", 귀하가 이겼습니다!" );
//            return true;
//        } else {
//            System.out.println("you=" + getMove(you) + ", comp="
//                    + getMove(com) + ", 귀하가 졌습니다!" );
//            return true;
//        }
//    }

// 방법 2 (방법 1의 코드를 조금 더 간결하게)

    // 가위 바위 보를 미리 정함
    // String 배열을 생성 후, 배열의 인덱스를 이용해 가위 바위 보를 출력
    private String[] moves = {"가위", "바위", "보"};

    public void playGame() {
        Scanner sc = new Scanner(System.in);
        do {
            com = (int) (Math.random() * 3);
            System.out.print("0: 가위, 1: 바위, 2: 보 ");
            you = sc.nextInt();
        } while (you < 0 || you > 2 || !findWinner());
    }


    private boolean findWinner() {
        int winner = (3 + you - com) % 3; // 0 : 비김, 1 : 이김, 2 : 짐
        System.out.println("you=" + moves[you] + ", com=" + moves[com] + ", " +
                (winner == 0 ? "비겼습니다. 다시 입력하세요." : winner == 1 ? "귀하가 이겼습니다." : "귀하가 졌습니다."));
        System.out.println(winner == 1);
        return winner == 1;
    }

    public static void main(String[] args) {
        가위바위보 game = new 가위바위보();
        game.playGame();
    }
}
