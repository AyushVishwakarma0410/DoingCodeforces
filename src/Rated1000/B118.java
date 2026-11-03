package Rated1000;

import java.util.Scanner;

public class B118 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        for (int i = 0; i <= n; i++){

            // initial spacing
            for (int j = 0; j < n-i; j++){
                System.out.print("  ");
            }

            int j = 0;

            // the number print spacing
            for (; j <= i; j++){

                if(j >0)
                    System.out.print(" ");
                System.out.print(j);
            }

            // the numbers after the max has been hit
            for ( int k = j-2; k >= 0 ;k--){
                System.out.print(" " +k);
            }

            System.out.println();


        }
        for (int i = n-1; i >= 0; i--){

            for (int j = 0; j < n-i; j++){
                System.out.print("  ");
            }

            int j = 0;

            for (; j <= i; j++){
                if (j > 0) System.out.print(" ");
                System.out.print(j);
            }

            for ( int k  = j-2; k >= 0 ;k--){
                System.out.print(" " +k);
            }

            System.out.println();


        }



    }


}
