package DSA;

import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        int[][] jaggedArray = createJaggedArray();
        displayJaggedArray(jaggedArray);
    }

    public static int[][] createJaggedArray() {
        Scanner scanner = new Scanner(System.in);

        int[][] jaggedArray = new int[4][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[4];
        jaggedArray[3] = new int[1];

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        return jaggedArray;
    }

    public static void displayJaggedArray(int[][] jaggedArray) {
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
