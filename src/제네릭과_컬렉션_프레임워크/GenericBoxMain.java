package 제네릭과_컬렉션_프레임워크;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

//        genericBox.add(new Integer(5)); // 컴파일 오류
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(new Integer(5));
        Integer intValue = intBox.get();
        System.out.println(intValue);

        // 오브젝트 타입도 가능
        GenericBox<Object> objBox = new GenericBox<>();
        objBox.add("hello");
        String str2 = (String)objBox.get();
        System.out.println(str2);
    }
}
