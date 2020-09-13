package basicProgrammingConcepts;

import java.util.Scanner;

public class IntOps {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
    int sum = a + b;
    int prod = a * b;
    int quot = a / b;
    int rem = a % b;
    System.out.println(a + " + " + b + " = " + sum);
    System.out.println(a + " * " + b + " = " + prod);
    System.out.println(a + " / " + b + " = " + quot);
    System.out.println(a + " % " + b + " = " + rem);
	}
}
