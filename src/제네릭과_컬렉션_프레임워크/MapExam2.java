package 제네릭과_컬렉션_프레임워크;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");

        Set<String> KeySet = map.keySet();
        Iterator<String> iterator = KeySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key+" : "+value);
        }
    }
}
