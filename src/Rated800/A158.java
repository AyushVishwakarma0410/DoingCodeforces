package Rated800;
import java.util.Scanner;

public class A158 {


    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int target = 0;

        int [] arr = new int[n];

        for(int i =0; i < n; i++){

            arr[i] = sc.nextInt();
            if(i==k-1){
                target = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= target && arr[i] > 0) {
                count++;
            }
        }



        System.out.println(count);

    }

}