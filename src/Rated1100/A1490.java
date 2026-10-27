package Rated1100;

import java.util.Scanner;

public class A1490 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        // test cases loop
        for (int i = 0; i < t; i++) {

            long number = sc.nextLong();
            boolean isFound = false;

            long a = 1;
            long b = (long) Math.cbrt(number);

            while (a <= b) {
                long a3 = a * a * a;
                long b3 = b * b * b;
                long ans = a3 + b3;

                if (number == ans) {
                    System.out.println("YES");
                    isFound = true;
                    break;
                } else if (number > ans) {
                    a++;
                } else {
                    b--;
                }
            }

            if (!isFound) {
                System.out.println("NO");
            }
        }

    }
}
