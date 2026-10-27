
package Rated800;

import java.util.Scanner;

public class A71 {





        public static void main(String [] args){
//
//
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
//


            String [] words = new String[n];



            for(int i = 0; i < words.length;i++){

                words[i] = sc.nextLine();

                if(words[i].length()>10){

                    StringBuilder sb = new StringBuilder();
                    sb.append(words[i].charAt(0));

                    sb.append(words[i].length()-2);

                    sb.append(words[i].charAt(words[i].length()-1));


                    words[i] = new String(sb);

                }



            }

            for(String s : words){

                System.out.println(s);

            }






        }


}
