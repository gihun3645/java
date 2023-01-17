package 배열;

public class ItemForArray {
    private int price;
    private String name;
    // 불변 클래스(생성할 때 값을 넣어주고, 그 나중에는 값을 바꿀 수 없다.)
    public ItemForArray(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
