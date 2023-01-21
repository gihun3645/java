package 배열;

import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};

        Arrays.sort(array);

        // 바이너리 서치는 정렬된 값에서 찾는거..
        int i = Arrays.binarySearch(array, 4);
        System.out.println(i);
    }
}
