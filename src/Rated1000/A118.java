package Rated1000;

import java.util.Scanner;

public class A118 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String sb = s.toLowerCase();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < sb.length() ;i++){
            if(sb.charAt(i)=='a'|| sb.charAt(i)=='o'|| sb.charAt(i)=='y' || sb.charAt(i)=='e' || sb.charAt(i)=='u' || sb.charAt(i)=='i'){
                continue;
            }
            else {
                ans.append('.');
                ans.append(sb.charAt(i));
            }
        }

        System.out.println(ans);




    }
}
