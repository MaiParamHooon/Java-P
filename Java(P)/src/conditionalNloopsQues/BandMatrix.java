package conditionalNloopsQues;

import java.util.Scanner;

public class BandMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (Math.abs(i - j) <= width) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }

    }
}
