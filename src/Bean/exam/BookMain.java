package Bean.exam;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Java", 100000);
        System.out.println(book.getTitle());;
        System.out.println(book.getPrice());;
    }
}