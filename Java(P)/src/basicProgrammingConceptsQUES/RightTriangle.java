package basicProgrammingConceptsQUES;

import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int m = Math.max(a, b);
		int n = Math.max(m, c);

		int z = b * b + c * c;
		double g = Math.sqrt(z);
		double f = n;

		int t = a * a + c * c;
		double h = Math.sqrt(t);
		double d = n;

		int k = b * b + a * a;
		double j = Math.sqrt(k);
		double l = n;
		System.out.println(g == f || j == l || h == d && a > 0 && b > 0 && c > 0);
	}
}
