package DSA;

public class find6and7 {

        static void find6and7(int[] arr){
            int Numofsix = 0;
            int Numofseven = 0;
            for(int i=0; i<arr.length; i++){
                if((arr[i] == 6 && arr[i+1] == 6)){
                    Numofsix++;
                }else if((arr[i] == 6 && arr[i+1] == 7)){
                    Numofseven++;
                }
            }
            System.out.println("no. of six-six are "+Numofsix);
            System.out.println("no. of six-seven are "+Numofseven);
        }
        public static void main(String args[]){
            int[] arr1 = {2,5,8,5,6,7,6,6,6,7};
            find6and7(arr1);
}
    }

