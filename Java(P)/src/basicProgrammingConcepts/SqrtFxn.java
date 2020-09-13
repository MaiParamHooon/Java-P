package basicProgrammingConcepts;

import java.util.Scanner;

public class SqrtFxn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        // error tolerance (15 places)
	        double EPS = 1E-15;
	        double c = sc.nextDouble();
	        double t = c;
	        while (Math.abs(t - c / t) > t * EPS)
	            t = (c / t + t) / 2.0;
	        System.out.println(t);
	    
    }
}
