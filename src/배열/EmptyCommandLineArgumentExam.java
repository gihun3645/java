package 배열;

public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

// String[] args = new String[0];
// main(args);

// javac EmptyCommandLineArgumentExam.java
// javac EmptyCommandLineArgumentExam.java a b c d hello
// java -javaagent:어떤설정 javac EmptyCommandLineArgumentExam a b c
// 옵션들은 클래스명과 java 명려어 사이에 존재