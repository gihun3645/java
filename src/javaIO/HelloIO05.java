package javaIO;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelloIO05 {
    public static void main(String[] args) throws Exception{
        // FileOutputStream은 "/tmp/my.txt"에 저장한다.
        // FileOutputStream은 write(int); int의 마지막 byte만 저장
        // OutputStreamWriter는 생성자에 돌어온 OutputStreamWriter의  write()를 이용하여 쓴다.
        // OutputStreamWriter는 writer(int); int 끝부분 char를 저장
        // PrintWriter는 생성자에 들어온 OutputStreamWriter의 write()를 이용하여 쓴다.
        // PrintWriter는 Println(문자열); 문자열을 출력한다.
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/tmp/my.txt")));
        out.println("hello");
        out.println("world");
        out.println("!!!!!");
        out.close();
    }
}
