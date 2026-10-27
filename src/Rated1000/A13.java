package Rated1000;

import java.util.Scanner;

public class A13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();




        int sum = 0;
        for (int i = input-1; i >= 2 ; i--) {

            int n = input;

            int rem = 0;
            while (n >= i){
                rem += n % i;
                n = n/i;
            }
            sum += rem+n;
        }


        int num2 = input-2;

        int gcd = HCF(sum,num2);





        System.out.println((sum/gcd) + "/" + (num2/gcd));


    }

    public static int HCF(int a, int b){

        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }


        return a;

    }
}
