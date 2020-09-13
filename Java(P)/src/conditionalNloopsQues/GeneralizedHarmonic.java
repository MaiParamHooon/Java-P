package conditionalNloopsQues;

import java.util.Scanner;

public class GeneralizedHarmonic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        double sum = 0;
        int t = 0;

        for (int i = 1; i <= n; i++) {
            double mul = 1;
            if (r >= 0) {
                for (int j = 1; j <= r; j++) {
                    mul *= 1.0 / i;
                }
                sum += mul;
            }
            else {
                t = Math.abs(r);
                for (int j = 1; j <= t; j++) {
                    
                    mul *= i;
                }
                sum += mul;
            }

        }
        System.out.println(sum);

    }
}
