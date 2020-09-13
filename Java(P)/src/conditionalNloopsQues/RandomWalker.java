package conditionalNloopsQues;

import java.util.Scanner;

public class RandomWalker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int x = 0;
        int y = 0;
        int count = 0;
        System.out.println("(0, 0)");
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
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + count);
	}
}
