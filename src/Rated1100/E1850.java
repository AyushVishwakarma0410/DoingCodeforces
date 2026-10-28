package Rated1100;

import java.util.Scanner;

public class E1850 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            int t = sc.nextInt();


            for (int i = 0; i < t; i++){

            // number of paintings
            int n = sc.nextInt();

            // Area of cardboard
            long c = sc.nextLong();

            int [] arr = new int[n];

            for (int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }

            // Total
            double squareC = Math.sqrt(c);

            long start = 0;
            long end = (long) squareC;

            while (start<= end){

                long mid = start + (end - start)/2;

                int ans = check(mid,arr,c);
                if(ans==0){
                    System.out.println(mid);
                    break;
                }
                else if(ans == 1){
                    start = mid + 1 ;
                }else {
                    end = mid - 1 ;
                }


            }
            }

    }

    public static int check(long w,int [] arr,long target){

        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            long side = arr[i] + (2*w);
            total += side * side;
            if(total > target){
                return -1;
            }
        }

        // found
        if(total==target){
            return 0;
        }
        // current total is bigger need smaller value
        else if(total>target){
            return -1;
        }
        // current total is smaller need bigger value
        else {
            return 1;
        }


    }

}
