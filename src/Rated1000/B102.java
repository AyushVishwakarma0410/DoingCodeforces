package Rated1000;

import java.math.BigInteger;
import java.util.Scanner;

public class B102 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count = 0;

        while (s.length() > 1) {

            Integer sum = 0;

            count++;
            for (int i = 0; i < s.length(); i++) {

                int digit = s.charAt(i) - '0';
                sum += digit;

            }
            s = Integer.toString(sum);
        }

        System.out.println(count);




    }
}





// TLE
/*

        Scanner sc = new Scanner(System.in);

        long count = 0;

        BigInteger input = sc.nextBigInteger();

        while (input.compareTo(BigInteger.valueOf(9)) > 0){


            BigInteger sum = BigInteger.ZERO;
            count++;
            while (input.compareTo(BigInteger.ZERO) > 0){
                BigInteger rem =  input.mod(BigInteger.TEN);
                input = input.divide(BigInteger.TEN);
                sum = sum.add(rem);
            }

            input = sum;

        }

        System.out.println(count);


 */
