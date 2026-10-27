package Rated1000;

import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        String end = sc.nextLine();

        char startAlpha = start.charAt(0);
        char endAlpha = end.charAt(0);

        char startDigit = start.charAt(1);
        char endDigit = end.charAt(1);


        System.out.println(Math.max(Math.abs(startAlpha-endAlpha),Math.abs(startDigit-endDigit)));
        while (startAlpha!=endAlpha || startDigit!=endDigit){

            if(startAlpha < endAlpha && startDigit < endDigit){
                startAlpha++;
                startDigit++;
                System.out.println("RU");
            }
            else if(startAlpha < endAlpha && startDigit > endDigit) {
                startAlpha++;
                startDigit--;
                System.out.println("RD");
            }
            else if(startAlpha > endAlpha && startDigit < endDigit){
                startAlpha--;
                startDigit++;
                System.out.println("LU");
            }
            else if(startAlpha > endAlpha && startDigit > endDigit){
                startAlpha--;
                startDigit--;
                System.out.println("LD");
            }
            else if(startAlpha == endAlpha && startDigit < endDigit){
                startDigit++;
                System.out.println("U");
            }
            else if(startAlpha == endAlpha && startDigit > endDigit){
                startDigit--;
                System.out.println("D");
            }
            else if(startAlpha < endAlpha && startDigit == endDigit){
                startAlpha++;
                System.out.println("R");
            }
            else if(startAlpha>endAlpha && startDigit==endDigit){
                startAlpha--;
                System.out.println("L");
            }



        }



    }



}
