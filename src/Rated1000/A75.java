package Rated1000;

public class A75 {
    public static void main(String[] args) {


        int a = 105;
        int b = 106;
        int c = a+b;



        int newA = 0;
        int newB = 0;
        int newC = 0;

        int i = 1;
        while (a > 0){

//            for a
            int rem = a % 10;
            a = a / 10;


            if(rem!=0 && newA!=0){
                rem = rem * (int)Math.pow(10,i);
                i++;
            }
            newA += rem;


        }

        System.out.println(newA);



        i = 1;
        // for b
        while (b > 0){
            // for b
            int rem = b % 10;
            b = b / 10;


            if(rem!=0 && newB!=0){
                rem = rem * (int)Math.pow(10,i);
                i++;
            }
            newB += rem;

        }


        System.out.println(newB);


        i = 1;
//        for c
        while (c>0){
            // for b
            int rem = c % 10;
            c = c / 10;


            if(rem!=0 && newC!=0){
                rem = rem * (int)Math.pow(10,i);
                i++;
            }
            newC += rem;
        }


        int sum = newA + newB;


        if(sum==newC){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }



    }
}
