package DSA;

import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        removeElement(arr, 5);

    }
    static void removeElement(int[] arr, int target){
        int[] arr1 = new int[arr.length];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element != target){
                arr1[newIndex] = element;
                newIndex++;
            }

        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr1, newIndex)));
    }
}

