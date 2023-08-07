import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.print("Enter 7 elements of array: ");
        for (int i = 0;i< arr.length; i++){
            arr[i]=myScan.nextInt();
        }
        System.out.println("Enter value you want to search: ");
        int val = myScan.nextInt();
        for (int j = 0; j<arr.length; j++ ){
            if(arr[j]==val){
                System.out.println("Element found at index position "+ j);
            }
        }

    }
}
