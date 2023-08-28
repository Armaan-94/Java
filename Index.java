package DSA;

public class Index {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 2;
        index(arr, target);
    }
    static void index(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                System.out.println("Index of target element is " + i);
            }
        }
    }
}
