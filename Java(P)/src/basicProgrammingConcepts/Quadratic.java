package basicProgrammingConcepts;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double discriminant = b * b - 4.0 * c;
        double d = Math.sqrt(discriminant);
        double root1 = (-b + d) / 2.0;
        double root2 = (-b - d) / 2.0;
        // Print them out.
        System.out.println(root1);
        System.out.println(root2);
	}

}
