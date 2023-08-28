package DSA;

class Median {
    static int FindMedian(int[] arr){
        int median = 0;
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length/2];
    }
    public static void main(String args[]){
        int[] arr1 = {59,65,34,56,99,42,78};
        System.out.println("the Median of array is "+FindMedian(arr1));
}
}
