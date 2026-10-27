package Rated1100;

import java.util.Scanner;

public class A270 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            int angle = 180 - sc.nextInt();

            if(360 % angle == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }


    }

}
