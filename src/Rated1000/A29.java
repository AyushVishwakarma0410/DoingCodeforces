package Rated1000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n==1){
            System.out.println("No");
            return;
        }
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n;i++){
            int key = sc.nextInt();
            int value = key + sc.nextInt();
            map.put(key,value);
        }

        for(int key: map.keySet()){

            int camel1 = key;
            int spit1 = map.get(key);
            Integer rev = map.get(spit1);
            if(rev!=null && rev==camel1){
                System.out.println("Yes");
                return;
            }

        }


        System.out.println("No");

    }



}
