package basicProgrammingConcepts;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double r = Math.random();
		int t=(int)(r*n);
		System.out.println(t);
	}

}
