package Array;

    import java.util.Scanner;

    public class ArraySearch {
        public static void main(String[] args) {
            int[] arr = new int[10];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 10 integers:");

            // Read integers into the array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Enter a number to search:");

            // Read the number to search
            int num = scanner.nextInt();

            // Search for the number and display its index
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    index = i;
                    break;
                }
            }

            // Display the array elements and the search result
            System.out.println("Array elements: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if (index != -1) {
                System.out.println("Index of " + num + " is " + index);
            } else {
                System.out.println(num + " is not present in the array.");
            }
        }
    }


