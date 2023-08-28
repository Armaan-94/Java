package DSA;

public class Secondmax {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 1, 2};
        insertion(arr);
        System.out.println(arr[arr.length-2]);

    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  // i < (n-2)
            for (int j = i + 1; j > 0; j--) {       // j > 0 always
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
