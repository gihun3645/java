package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception{
        // 클라이언트가 접속할 때까지 대기
        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println("1");

        // 서버가 끊기지 않게
        try {
            while (true) {
                Socket clientSocket = serverSocket.accept(); // 대기한다. 클라이언트가 접속하면 클라이언트와 통신하는 Socket이 반환된다.
                System.out.println("2");

                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        } finally {
            serverSocket.close();
        }
    }
}

class ClientThread extends Thread {
    private Socket clientSocket;
    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }


    public void run() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));


            // localhost:10000/hello
            // localhost:10000/hi
            // GET /hello HTTP/1.1
            String firstLine = br.readLine();
            String msg = "";
            if (firstLine.indexOf("/hello") >= 0)
                msg = "hello";
            else if (firstLine.indexOf("/hi") >= 0)
                msg = "hi";
            System.out.println(firstLine);

            String line = null;
            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }
            // 빈줄까지 읽어들이면 끝

            System.out.println("3 - 응답을 한다.");

            pw.println("HTTP/1.1 200 OK"); // 응답
            pw.println("name : kim");
            pw.println("email:urstory@gmail.com");
            pw.println();
            pw.println("<html>"); // body 부분

            // GET /hello HTTP/1.1의 요청이 왔을 때 /index.html에 대한 파일을 읽어서 출력한다.
            // /hello 를 어디서 읽어들이냐?  서버 입장으로 봤을 때 어디 경로에 있는 파일을 읽어들이지?
            pw.println(firstLine + "!!!!");
            pw.println("</html>");

            pw.flush(); // 서버 전송
            br.close();
            pw.close();
            clientSocket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
