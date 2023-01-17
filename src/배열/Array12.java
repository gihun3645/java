package 배열;

public class Array12 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

//        for(int i=0; i< array.length; i++) { // i : 0,1,2,3,4
//            System.out.println(array[i]);
//        }

        for(int i : array) {
            System.out.println(i);
        }
    }
}
