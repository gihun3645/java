package 배열;

import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,7};
        int[] array2 = {1,2,3,4,6};


        // 양수, 0, 음수 (비교할 때는)
        // x - y = 결과가 양수가 나왔다면?
        int compare = Arrays.compare(array1, array2);

        System.out.println(compare);
    }
}
