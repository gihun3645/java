package 학교_자바수업.practice;

public class Book {
    private static int bookCount = 0;
    private String title;
    private String author;
    private int price;

    public Book() {
        bookCount++;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    public void setValue(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void discountBy(int percent) {
        int discount = (int) (price * percent / 100.0);
        price -= discount;
    }

    public static int getBookCount() {
        return bookCount;
    }

    @Override
    public String toString() {
        return "제목=" + title + ", 저자=" + author + ", 가격=" + price + "원";
    }
}
