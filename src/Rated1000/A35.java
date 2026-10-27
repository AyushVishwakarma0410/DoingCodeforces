package Rated1000;


import java.util.Scanner;
public class A35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ballIdx = sc.nextInt();

        int [] arr = new int[3];

        arr[ballIdx-1] = 1;


        for (int i = 0 ;i < 3;i++ ){

            int first = sc.nextInt();
            int second = sc.nextInt();
            int temp = arr[first-1];
            arr[first-1] = arr[second-1];
            arr[second-1] = temp;

        }


        for (int i = 0 ;  i < 3; i++){
            if(arr[i]==1){
                System.out.println(i+1);
                return;
            }
        }

        sc.close();
        return;

    }
}
