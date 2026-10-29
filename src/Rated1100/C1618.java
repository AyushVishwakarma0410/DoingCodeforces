package Rated1100;

import java.util.Scanner;

public class C1618 {


    public static long findHCF(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % temp;
            a = temp;
        }
        return a;
    }

    public static long findMultipleHCF(long[] numbers) {

        long result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findHCF(result, numbers[i]);

            if (result == 1) {
                return 1;
            }
        }
        return result;
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            if(n==1){
                int ans = sc.nextInt();
                System.out.println(ans);
                continue;
            }

            long[] even ;
            long[] odd ;
            long [] arr = new long[n];

            if(n%2==0){
                even = new long[n/2];
                odd = new long[n/2];
            }
            else {
                even = new long[n/2 + 1];
                odd = new long[n/2];
            }

            for (int i = 0 ; i< n;i++){
                arr[i] = sc.nextLong();
            }


            int idxEven = 0;
            int idxOdd = 0;
            for (int i =0 ; i < n; i++){
                if(i%2==0){
                    even[idxEven] = arr[i];
                    idxEven++;
                }
                else {
                    odd[idxOdd] = arr[i];
                    idxOdd++;
                }
            }



            long HCFEven = 0;
            long HCFOdd = 0;

            HCFEven = findMultipleHCF(even);
            HCFOdd = findMultipleHCF(odd);


            int i = 0;
            while ( i < even.length){
                if(even[i]%HCFOdd==0){
                    break;
                }
                i++;
            }
            if(i==even.length){
                System.out.println(HCFOdd);
                continue;
            }

            i = 0;
            while (i < odd.length){
                if(odd[i]%HCFEven==0){
                    break;
                }
                i++;
            }

            if(i==odd.length){
                System.out.println(HCFEven);
                continue;
            }

            System.out.println(0);

        }

    }





    // it is not necessary that the number should be from the array
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//
//            int n = sc.nextInt();
//
//            long[] arr = new long[n];
//
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextLong();
//            }
//
//            boolean foundAns = false;
//
//            for (long num : arr) {
//
//                boolean[] isPainted = new boolean[arr.length];
//
//                int i = 0;
//
//                while (i < arr.length) {
//
//                    if (arr[i] % num == 0) {
//                        isPainted[i] = true;
//                    } else {
//                        isPainted[i] = false;
//                    }
//
//                    if (i == 0) {
//                        i++;
//                        continue;
//                    }
//
//                    if (isPainted[i - 1] == isPainted[i]) {
//                        break;
//                    }
//
//                    i++;
//                }
//
//                if (i == arr.length) {
//                    System.out.println(num);
//                    foundAns = true;
//                    break;
//                }
//            }
//
//            if (!foundAns) {
//                System.out.println(0);
//            }
//        }
//
//        sc.close();
//    }
}
