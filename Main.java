package DSA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }
}
