package objectorientedprogram;

public class Numbers {
	public Numbers() {
	
	}	
	public double returnSquare (double num) {
	System.out.println(num + "Squared is: "+ num*num);	
	return num;
}
	public double returnArea (double num, double num2) {
		System.out.println("Area is: " + num*num2);
		return num;
		}
	public double returnRoundup(double num) {
		System.out.println( num + "rounded up is: "+Math.ceil(num) );
		return num;
	}
}


