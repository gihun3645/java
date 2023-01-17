package 상속;

public class Book {
    private String title;
    private int price; // field price

    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter, getter
    // setter, getter - 프로퍼티(property) - price 프로퍼티
    public int getPrice() {
        return this.price*2;
        // 자신이 갖고 있는 price 를 리턴
        // this 는 내 자신 인스턴스를 참조하는 예약어
    }

    public void setPrice(int price) { // 지역변수 price
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
