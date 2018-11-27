package desicions;

import java.util.Scanner;

public class Gradecalc {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int avgTest = 99;
		int avgHome = 99;
		boolean nice = false;
		int grade = 99;
		System.out.println("What is your test average");
		avgTest = input.nextInt();
		System.out.println("What is your Homework average");
		avgHome = input.nextInt();
		System.out.println("Is your teacher nice");
		nice = input.nextBoolean();
		if (nice == true) {
			if (avgTest >= avgHome) {
				System.out.println("Your grade is:" + avgTest);
			} else {
				System.out.println("Your grade is:" + avgHome);
			}
		} else {
			if (avgTest <= avgHome) {
				System.out.println("Your grade is:" + avgTest);
			} else {
				System.out.println("Your grade is:" + avgHome);
			}
		}
	}
}
