package Rated1100;

import java.util.Scanner;

public class C2009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();

            int xD = (x+k-1)/k;
            int yD = (y+k-1)/k;

            if(yD>=xD){
                System.out.println(2*yD);
            }
            else {
                System.out.println(2*xD-1);
            }




        }



    }
}
