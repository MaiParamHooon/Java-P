package basicProgrammingConceptsQUES;

import java.util.Scanner;

public class GreatCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x11 = sc.nextDouble();
        double x1 = Math.toRadians(x11);
        double y11 = sc.nextDouble();
        double y1 = Math.toRadians(y11);
        double x22 = sc.nextDouble();
        double x2 = Math.toRadians(x22);
        double y22 = sc.nextDouble();
        double y2 = Math.toRadians(y22);
        double r = 6371.0;
        double m = (x2 - x1) / 2;
        double x = Math.sin(m) * Math.sin(m);
        double n = Math.cos(x1) * Math.cos(x2) * Math.sin((y2 - y1) / 2) * Math.sin((y2 - y1) / 2);
        double z = Math.sqrt(n + x);
        double distance = 2 * r * Math.asin(z);
        System.out.println(distance + " kilometers");
	}

}
