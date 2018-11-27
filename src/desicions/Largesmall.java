package desicions;

import java.util.Scanner;

public class Largesmall {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double x = 0.0;
		double a = 0.0;
		double z = 0.0;
		System.out.println("Enter your test scores (9999) to finish!");
		x = input.nextDouble();
		while (x != 9999) {
			z = x;
			
		
if (a > z) {
	a = z;
}
	System.out.println("enter your test scores (9999) to finish!");
	x = input.nextDouble();
}
		System.out.println(a);
}
}