package DSA;

public class ArrayExp3 {
    public static void main(String[] args) {
        int[] arr = {68,42,56,34,89};
        int a = sum(arr);
        System.out.println("Sum of all elements in the array is: " +a);
        int b = sum2(arr);
        System.out.println("Sum of all alternate numbers in the array is: " +b);
        insertion(arr);
        System.out.println("The Second highest element in the array is: " + arr[arr.length-2]);


    }
    static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    static int sum2(int[] arr){
        int sum2 = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sum2 = sum2 + arr[i];

        }
        return sum2;
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