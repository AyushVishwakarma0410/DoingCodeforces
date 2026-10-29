    package Rated1000;

    import java.util.Scanner;

    public class A1141 {

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();

            if(m%n!=0){
                System.out.println(-1);
                return;
            }

            int d = m/n;


            int count = 0;
            while (d%2==0){
                count++;
                d=d/2;
            }
            while (d!=0 && d%3==0){
                count++;
                d=d/3;
            }

            if(d!=1){
                System.out.println(-1);
                return;
            }

            System.out.println(count);



        }
    }
