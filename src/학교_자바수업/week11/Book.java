package 학교_자바수업.week11;

public class Book {
    private String title;
    private String author;
    private String info;

    // 생성자 메서드의 매개변수
    // 클래스의 인스턴스를 생성할 때 전달되는 값을 저장하는 역할
    public Book(String title, String author, String info) {
        // 인스턴스 변수에 접근하기 위해 사용되는 this
        this.title = title;
        this.author = author;
        this.info = info;
    }

    public String toString () {
        return title;
    }

    public String getFullInfo() {
        return title + " - " + author + "저\n " + info;
    }
}
