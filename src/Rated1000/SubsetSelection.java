package Rated1000;
import java.util.Scanner;
import java.util.HashMap;

public class SubsetSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int test1 = scanner.nextInt();

        StringBuilder out = new StringBuilder();

        while (test1-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            HashMap<Integer, Integer> m = new HashMap<>();
            int c = 0;

            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if (x < 0) {
                    c++;
                } else {
                    m.put(x, m.getOrDefault(x, 0) + 1);
                }
            }

            int a = 0;
            // Greedy simulation loop
            while (m.getOrDefault(a, 0) > 0 && c + m.get(a) >= k) {
                c += m.get(a) - k;
                a++;
            }

            out.append(a).append("\n");
        }
        System.out.print(out);
        scanner.close();
    }
}
