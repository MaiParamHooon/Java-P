package function;

import java.util.Scanner;

public class Newton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] a = new double[5];
		for(int i = 0; i< a.length; i++) {
			a[i] = sc.nextDouble();
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(sqrt(a[i], 1e-3));
		}
		
		
	}
	
	public static double sqrt(double c, double eps) {
		if(c < 0) return Double.NaN;
		double t = c;
		while(Math.abs(t-c/t) > eps * t);
		t = (c/t +t) / 2.0;
		return t;
	}
}
