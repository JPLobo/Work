package desicions;

import java.util.Scanner;

public class Luckynumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int height = 9;
		int weight = 9;
		int age = 9;
		int xheight = 9;
		int xweight = 9;
		System.out.println("What is your age?");
		age = input.nextInt();
		if (age >= 18) {
			System.out.println("What is your height?");
			height = input.nextInt();
			xheight = height * 5;
			System.out.println("Your lucky number is: ");
			System.out.println(xheight);
		} else {
			System.out.println("What is your weight?");
			weight = input.nextInt();
			xweight = weight / 2;
			System.out.println("Your lucky number is:");
			System.out.println(xweight);
		}
	}
}
