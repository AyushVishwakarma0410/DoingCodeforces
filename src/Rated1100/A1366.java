package Rated1100;

import java.util.Scanner;

public class A1366 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();



        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int count = 0;
            while (a > 0 && b > 0){
                if(a > b && a-2 >= 0 && b-1 >= 0){
                    a = a-2;
                    b = b-1;
                }else if(b >=a && b-2 >= 0 && a-1 >= 0){
                    b = b-2;
                    a = a-1;
                }

                count++;
                if(a==1 && b==1){
                    break;
                }
            }
            System.out.println(count);


        }
    }
}
