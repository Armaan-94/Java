package DSA;


    import java.util.*;
    public class Difference {
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int size = in.nextInt();
            int[] arr1 = new int[size];
            System.out.println("Enter the elements in the array: ");
            for(int i = 0; i<arr1.length; i++){
                arr1[i] = in.nextInt();
            }

            System.out.println(Arrays.toString(arr1));
            int max = 0;
            int min = arr1[0];
            for(int i=0; i<arr1.length; i++){
                if(max<arr1[i]){
                    max = arr1[i];
                }
                if(min>arr1[i]){
                    min = arr1[i];
                }
            }
            System.out.println("The maximum element in the array is "+ max);
            System.out.println("The minimum element in the array is "+ min);
            System.out.println("The difference between the maximum and minimum element is "+ (max-min));
        }
    }


