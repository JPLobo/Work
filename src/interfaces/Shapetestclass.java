package interfaces;

import java.util.Scanner;

public class Shapetestclass {
	public static void main (String[]args) {
		double le = 0;
		double wi = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the Rectangle?");
		le = input.nextDouble();
		System.out.println("What is the width of the Rectangle?");
		wi= input.nextDouble();
		Shape bob = new Rect(le, wi);
		System.out.println(bob.area());
		System.out.println(bob.perimeter());
	}

}
