package array;

import java.util.Scanner;

public class SelfAvoidingWalker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[N][N];
            int x = N / 2, y = N / 2;
            while (x > 0 && x < N - 1 && y > 0 && y < N - 1) {
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEnds++;
                    break;
                }
                a[x][y] = true;
                double r = Math.random();
                if (r < 0.25) {
                    if (!a[x + 1][y]) x++;
                }
                else if (r < 0.50) {
                    if (!a[x - 1][y]) x--;
                }
                else if (r < 0.75) {
                    if (!a[x][y + 1]) y++;
                }
                else if (r < 1.00) {
                    if (!a[x][y - 1]) x--;
                }
            }
        }
        System.out.println(100 * deadEnds / trials + "% dead ends");
    }
}
