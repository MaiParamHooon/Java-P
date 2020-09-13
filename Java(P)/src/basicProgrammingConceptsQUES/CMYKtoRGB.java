package basicProgrammingConceptsQUES;

import java.util.Scanner;

public class CMYKtoRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
        double m = sc.nextDouble();
        double y =  sc.nextDouble();
        double b =  sc.nextDouble();

        double white = 1 - b;
        int red = (int) (255 * white * (1 - c));
        int green = (int) (255 * white * (1 - m));
        int blue = (int) (255 * white * (1 - y));
        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
	}

}
