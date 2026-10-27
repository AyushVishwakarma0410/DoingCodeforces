
package Rated800;


import java.util.Scanner;

public class A231 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            int petya = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(petya+b+c>1){
                count++;
            }

        }


        System.out.println(count);



    }
}
