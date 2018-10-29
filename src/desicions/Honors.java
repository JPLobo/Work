package desicions;

import java.util.Scanner;

public class Honors {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double gpa = 3.5;
		int grade = 5;
		System.out.println("What is your GPA?");
		gpa = input.nextDouble();
		System.out.println("What is your grade? (numeric value)");
		grade = input.nextInt();
		if (gpa >= 3.5 && grade >= 12) {
			System.out.println("You are eligible for Honors!");
		}
		else {
			System.out.println("You are not eligible for Honors");
		}
	}
}