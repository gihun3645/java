package 학교_자바수업.practice;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    // equals(Object oBook)상황에서는
    // 슈퍼 클래스의 참조 변수로는 서브클래스 맴버를 접근하지 못한다.
    // 대충 별로 안좋다는 말?
    // instanceof 연산자를 사용해야함
//    public boolean equals(Object oBook) {
//        return title.equals(oBook.title)
//                && author.equals(oBook.author);
//    }
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Book) {
            // 매개변수를 Book 타입으로 다운케스팅
            Book oBook = (Book) obj;
            return title.equals(oBook.title)
                    && author.equals(oBook.author);
        }
        else
            return false;
    }

    // Object의 toString 메소드는 별로라 각 클래스에 맞게 오버라이딩 하는게 나음
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }

    public static void main(String[] args) {
        Book b1 = new Book("벌레 이야기", "이청준");
        System.out.println("b1 = " + b1);
        Book b2 = new Book("벌레 이야기", "이청준");
        System.out.println("b2 = " + b2);
        System.out.println("b1.eqauls(b2) : " + b1.equals(b2)); // 문자열이 같아서 true를 반환
    }
}