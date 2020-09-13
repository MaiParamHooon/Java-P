package conditionNloops;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int stake = sc.nextInt();
        int goal = sc.nextInt();
        int trials = sc.nextInt();
        int wins = 0;
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                if (Math.random() < 0.5) cash++;
                else cash--;
            }
            if (cash == goal) wins++;

        }
        System.out.println(wins + " wins of " + trials);

    }
}
