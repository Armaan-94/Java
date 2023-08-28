package DSA;

    import java.util.Arrays;

    public class Pair {
        public static void main(String[] args) {
            int[] arr = {5,9,6,8,7};
            swapPairs(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void swapPairs(int[] arr) {
            for (int i = 0; i < arr.length - 1; i+=2) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
}

    }
