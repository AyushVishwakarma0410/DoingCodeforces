package Rated800;

import java.util.Arrays;
import java.util.Scanner;

public class A263 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // i want 2,2

        int idxi = 0;
        int idxj = 0;

        boolean isFound = false;

        for (int i =0 ;i < 5; i ++){
            for (int j = 0; j < 5; j++) {
                int entry = sc.nextInt();
                if(entry==1){
                    idxi = i;
                    idxj = j;
                    isFound = true;
                    break;
                }

            }
            if(isFound){
                break;
            }
        }

        System.out.println(Math.abs(idxi-2)+Math.abs(idxj-2));

    }
}
