package DSA;

    public class LinearSearch {
        public static void main(String[] args) {
            int[] arr = {4,392,89,65,43,79,54};
            int target = 65;
            int ans = linearsearch(arr, target);
            System.out.println(ans);

        }
        static int linearsearch(int[] arr, int target){
            if(arr.length==0){
                return -1;
            }
            for (int i = 0; i < arr.length ; i++) {
                int element = arr[i];
                if(element==target){
                    return arr[i];
                }
            }
            return 0;
        }
    }

