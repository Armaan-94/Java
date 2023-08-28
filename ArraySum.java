package Array;

    import java.util.Scanner;

    public class ArraySum {
        public static void main(String[] args) {
            int[] arr = new int[5];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 5 integers:");

            // Read integers into the array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            // Display menu and get user's choice
            System.out.println("Choose an option:");
            System.out.println("1. Sum of all elements");
            System.out.println("2. Sum of alternate elements");
            int choice = scanner.nextInt();

            // Call the appropriate function based on the user's choice
            switch (choice) {
                case 1:
                    int sum = sumArray(arr);
                    System.out.println("Sum of all elements: " + sum);
                    break;
                case 2:
                    int altSum = sumAlternate(arr);
                    System.out.println("Sum of alternate elements: " + altSum);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

        // Function to calculate the sum of all elements in the array
        public static int sumArray(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }

        // Function to calculate the sum of alternate elements in the array
        public static int sumAlternate(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i += 2) {
                sum += arr[i];
            }
            return sum;
        }
    }


