package desicions;

import java.util.Scanner;

public class Count5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		double num = input.nextDouble();
		double x = 0;
		while (x+ 4.999999999999 < num) {
			x = x + 5;
			System.out.println(x);
		}
	}
}
