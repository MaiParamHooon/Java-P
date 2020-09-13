package fxnQues;

public class ActivationFxn {
	
	public static double heaviside(double x) {
		if(x<0)return 0;
		else if(x==0) return 1/2;
		else return 1;
		}
	
	public static double sigmoid(double x) {
		double y = 1 + Math.exp(-x);
		return 1/y;
	}
	
	public static double tanh(double x) {
		double y = Math.exp(x) - Math.exp(-x);
		double z = Math.exp(x) + Math.exp(-x);
		return y/z;
	}
	
	public static double softsign(double x) {
		double y = 1 + Math.abs(x);
		return x/y;
	}
	
	public static void main(String[] args) {
		System.out.println(softsign(1.0));
		
		
	}
}
