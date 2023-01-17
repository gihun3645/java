package 배열;

public class Array04 {
    public static void main(String[] args) {
        ItemForArray[] array1; // 아무것도 참조하는게 없음(null)
        ItemForArray array2[]; // 아무것도 참조하는게 없음(null)

        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "item01");
        array1[1] = new ItemForArray(1000, "item02");

        ItemForArray i1 = new ItemForArray(500, "itemAAA");

        System.out.println(array1[0].getName());
        System.out.println(array1[0].getPrice());
        System.out.println(i1.getPrice());
    }
}
