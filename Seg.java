package DSA;

import java.util.Arrays;

public class Seg {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,0,1,0,0,0};
        segregate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void segregate(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
