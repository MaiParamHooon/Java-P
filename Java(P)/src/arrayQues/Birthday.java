package arrayQues;

import java.util.Scanner;

public class Birthday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int trials = Integer.parseInt(args[1]);
        int bday = 0;
        int filled = 0;
        int[] count = new int[trials];
        boolean bdays[];
        for (int i = 0; i < trials; i++) {
            bdays = new boolean[n];
            for (int j = 1; j < n; j++) {
                bday = (int) (Math.random() * n);
                if (j > filled) filled = j;
                if (!bdays[bday]) bdays[bday] = true;
                else {
                    count[j]++;
                    break;
                }
            }
        }
        double[] fraction = new double[filled];
        for (int i = 1; i < filled; i++) {
            fraction[i] = fraction[i - 1] + (double) count[i] / trials;
            System.out.println(i + " " + count[i] + " " + fraction[i]);
            if (fraction[i] >= 0.5) break;
        }
    }
}
