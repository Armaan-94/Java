package DSA;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of size 10
        int[] arr = new int[10];

        // Take input for the position and value
        System.out.println("Enter the position (0-9) to insert the item:");
        int position = scanner.nextInt();

        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position. Position should be between 0 and 9.");
            return;
        }

        System.out.println("Enter the item value:");
        int item = scanner.nextInt();

        // Insert the item at the specified position
        for (int i = arr.length - 2; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = item;

        // Print the final array
        System.out.println("Final array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
