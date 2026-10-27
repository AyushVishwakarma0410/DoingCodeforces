package Rated1000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            String team = sc.nextLine();
            map.put(team,map.getOrDefault(team,0)+1);
        }

        int max = 0;
        String winner =new String();
        System.out.println(map);
        for(String key : map.keySet()){

            if(max < map.get(key)){
                winner = key;
                max = map.get(key);
            }
        }


        System.out.println(winner);

    }
}
