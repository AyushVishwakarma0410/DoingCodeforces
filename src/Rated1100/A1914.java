package Rated1100;

import java.util.Scanner;

public class A1914 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        for (int i = 0; i < t; i++ ){

            int sum = 0;
            int maxB = 0;
            int ans = 0;


            int n = sc.nextInt();
            int k = sc.nextInt();

            int [] a = new int[n];
            int [] b = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }

            for (int j = 0; j < Math.min(n,k); j++) {
                sum += a[j];
                maxB = Math.max(maxB,b[j]);

                int score = sum + (maxB * (k-j-1));

                ans = Math.max(ans,score);

            }

            System.out.println(ans);


        }

    }


}
