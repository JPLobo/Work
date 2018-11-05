package desicions;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a = 0;
		double c = 0;
		double g = 0;
		System.out.println("Enter a value (9999 to stop)");
		c = input.nextInt();
		while (c != 9999) {
			a = c+a;
			g++;
			System.out.println("Enter a value (9999 to stop)");
			c = input.nextInt();
		}
		System.out.println("Average =" + a /g);
	}
}
