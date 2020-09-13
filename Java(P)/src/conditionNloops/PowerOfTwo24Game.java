package conditionNloops;

import java.util.Scanner;

public class PowerOfTwo24Game {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

        int i = 0;
        int v = 1;
        while (i <= n) {
            System.out.println(v);
            i = i + 1;
            v = 2 * v;
        }
}
}
