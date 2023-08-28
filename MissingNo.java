package DSA;

public class MissingNo {
    public static int findMissingNumber(int[] arr) {
        int totalSum = (arr.length + 1) * (arr.length + 2) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 8, 9, 10}; // An array with one missing number (7)
        int missingNumber = findMissingNumber(integerArray);
        System.out.println("The missing number is: " + missingNumber);
    }
}