import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        long start = 1;
        long groupSize = 1;

        while (n >= start + 5 * groupSize) {
            start = start + 5 * groupSize;
            groupSize = 2 * groupSize;
        }

        int index = (int) ((n - start) / groupSize);


        switch (index){
            case 0 : System.out.println("Sheldon");
            break;
            case 1 : System.out.println("Leonard");
            break;
            case 2 : System.out.println("Penny");
            break;
            case 3 : System.out.println("Rajesh");
            break;
            case 4 : System.out.println("Howard");
        }
    }
}