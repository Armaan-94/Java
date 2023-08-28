package Array;

    import java.util.Scanner;
    public class MaxMin {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
// Get the size of the array from the user
            System.out.print("Enter the size of the array: ");
            int size = input.nextInt();
// Create an array of the given size
            int[] arr = new int[size];
// Get the elements of the array from the user
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
// Find the maximum and minimum values in the array
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < size; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
// Display the maximum and minimum values of the array
            System.out.println("The maximum value of the array is: " + max);
            System.out.println("The minimum value of the array is: " + min);
        }
    }



