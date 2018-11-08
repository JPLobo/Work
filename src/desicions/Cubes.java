package desicions;

import java.util.Scanner;

public class Cubes {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		double num = input.nextInt();
		while(num != -1) {
			num = Math.pow(num,3);
			System.out.println(num);
			System.out.println("Enter your number (-1) to cancel");
			num = input.nextInt();
		}
}
}
