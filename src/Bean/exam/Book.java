package Bean.exam;

public class Book {
    private String title;
    private int price;

    // 아무것도 안하는 기본 생성자가 있어야함
    public Book() {

    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
