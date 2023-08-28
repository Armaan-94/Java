package Array;

    import java.util.Scanner;

    public class EvenOddArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for array input
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Count even and odd numbers in array
            int evenCount = 0;
            int oddCount = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Store even and odd numbers in separate arrays
            int[] evenArray = new int[evenCount];
            int[] oddArray = new int[oddCount];
            int evenIndex = 0;
            int oddIndex = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] % 2 == 0) {
                    evenArray[evenIndex] = array[i];
                    evenIndex++;
                } else {
                    oddArray[oddIndex] = array[i];
                    oddIndex++;
                }
            }

            // Display all three arrays along with their length
            System.out.print("Original Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("(" + size + " elements)");

            System.out.print("Even Array: ");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenArray[i] + " ");
            }
            System.out.println("(" + evenCount + " elements)");

            System.out.print("Odd Array: ");
            for (int i = 0; i < oddCount; i++) {
                System.out.print(oddArray[i] + " ");
            }
            System.out.println("(" + oddCount + " elements)");
        }
    }

