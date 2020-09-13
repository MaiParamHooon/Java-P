package conditionalNloopsQues;

import java.util.Scanner;

public class RandomWalkers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        long sum = 0;
        long trials = Long.parseLong(args[1]);
        long t = trials;
        while (trials-- != 0) {
            int x = 0;
            int y = 0;
            long count = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                if (Math.random() < 0.25) {
                    x++;
                }
                else if (Math.random() < 0.5 && Math.random() >= 0.25) {
                    y++;
                }
                else if (Math.random() < 0.75 && Math.random() >= 0.5) {
                    y--;
                }
                else if (Math.random() < 1 && Math.random() >= 0.75) {
                    x--;
                }
                count++;
            }
            sum += count;
        }
        double avg = (double) sum / t;
        System.out.println("average number of steps = " + avg);
    }
}
