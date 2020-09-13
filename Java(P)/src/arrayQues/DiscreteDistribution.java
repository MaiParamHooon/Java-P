package arrayQues;

import java.util.Scanner;

public class DiscreteDistribution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] a = new int[args.length - 1];
        int[] sum = new int[args.length];
        sum[0] = 0;
        for (int i = 0; i < args.length - 1; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            sum[i + 1] = sum[i] + a[i];
        }
        while (t-- != 0) {
            int r = (int) (Math.random() * sum[args.length - 1]);
            for (int i = 0; i < args.length - 1; i++) {
                if (r < sum[i + 1] && r >= sum[i]) {
                    System.out.print(i + " ");
                }
            }
        }
      }
}
