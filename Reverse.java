package DSA;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,7,6,5};
        reverseArray(arr);
    }
    static void reverseArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
