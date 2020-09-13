package basicProgrammingConcepts;

import java.util.Scanner;

public class SwappingVar {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
        int a = 1234;
        
        int b = 99;
        int t = a;
        a = b;
        b = t;
        System.out.println(a + " " + b);
    }
}
