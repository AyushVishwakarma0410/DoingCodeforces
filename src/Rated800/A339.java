package Rated800;

import java.util.Scanner;

public class A339 {



        public static void main(String [] args){

            Scanner sc = new Scanner(System.in);


            String s = sc.nextLine();

            int [] arr = new int[4];

            for(int i =0 ; i < s.length();i++){
                if(s.charAt(i)=='1'){
                    arr[1]++;
                }
                if(s.charAt(i)=='2'){
                    arr[2]++;
                }
                if(s.charAt(i)=='3'){
                    arr[3]++;
                }

            }
            StringBuilder sb = new StringBuilder();
            int count = arr[1];
            for(int i = 0 ; i < count; i++){
                sb.append(1);
                arr[1]--;
                sb.append('+');
            }

            count = arr[2];
            for(int i = 0 ; i < count; i++){
                sb.append(2);
                arr[2]--;
                sb.append('+');
            }

            count = arr[3];
            for(int i = 0 ; i < count; i++){
                sb.append(3);
                arr[3]--;
                sb.append('+');

            }
            sb.deleteCharAt(sb.length()-1);

            System.out.println(sb.toString());

        }

}
