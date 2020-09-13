package conditionNloops;

import java.util.Scanner;

public class NestingIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        double income = sc.nextDouble();
        double rate = 0.35;
        if (income < 47450) rate = 0.22;
        if (income < 114650) rate = 0.25;
        if (income < 174700) rate = 0.28;
        if (income < 311950) rate = 0.33;
        System.out.println(rate);
    }
}
