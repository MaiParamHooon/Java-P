package fxnQues;

public class Gcd {
	
	public static int gcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		while(b!=0) {
			int y = b;
			b = a % b;
			a = y;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		return (a*b)/gcd(a,b);
	}
	
	public static boolean relativePrime(int a, int b) {
		if(gcd(a, b)==1) {
			return true;
		}else return false;
	}
	
	public static void main(String[] args) {
		System.out.println(relativePrime(1440, 408));
		
		
	}
}
