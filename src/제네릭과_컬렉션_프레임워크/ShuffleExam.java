package 제네릭과_컬렉션_프레임워크;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("lee");
        list.add("kim");
        list.add("hong");

        // 정렬
        Collections.shuffle(list);

        for(int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
