package Rated800;

import java.util.Scanner;

public class A282 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        int ans = 0;

        // moving through Strings
        for (int i = 0; i < n; i++){

            String s = sc.nextLine();

            // moving inside the String
            for(int j =0; j < 3;j++){
               if(s.charAt(j)=='+'){
                   ans++;
                   break;
               }
               else if( s.charAt(j)=='-'){
                   ans--;
                   break;
               }
            }


        }

        System.out.println(ans);

    }


}
