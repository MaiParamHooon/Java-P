package basicProgrammingConceptsQUES;

import java.util.Scanner;

public class HelloGoodbye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        String hello = "Hello " + firstName + " and " + secondName + ".";
        String bye = "Goodbye " + secondName + " and " + firstName + ".";
        System.out.println(hello);
        System.out.println(bye);
	}

}
