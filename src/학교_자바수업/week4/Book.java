package 학교_자바수업.week4;

public class Book {
    private String title;
    private String author;

    public void setBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void writeInfo() {
        System.out.println("제목: "+title);
        System.out.println(", 저자: "+author);
    }

    public boolean equals(Book oBook) {
        return title.equals(oBook.title) && author.equals(oBook.author);
    }

    public String toString() {
        return "제목: "+title+", 저자: "+author;
    }
}
