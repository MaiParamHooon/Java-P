package conditionNloops;

import java.util.Scanner;

public class if3Sort {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b < a) {
            int t = a;
            a = b;
            b = t;
        }
        if (c < a) {
            int t = a;
            a = c;
            c = t;
        }
        if (c < b) {
            int t = b;
            b = c;
            c = t;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}
}
