import java.util.*;
        class rec_n_factorial{
            public static void main(String[] args) {
                //recursion program for n!
                Scanner myObj = new Scanner(System.in);
                System.out.println("Enter positive integer n:");
                int n = myObj.nextInt();
              long m = rec(n);
                System.out.println("Factorial is :" +m );
            }
            public static int rec(int n){
                if(n>1){
                return n*rec(n-1);}
            else{
            return 1;}
            }
        }

