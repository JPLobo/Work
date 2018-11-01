package desicions;

import java.util.Scanner;

public class grades {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double grade1 = 9.9;
		double grade2 = 9.9;
		double grade3 = 9.9;
		double avg = 9.9;
		System.out.println("What is your first test score?");
		grade1 = input.nextDouble();
		System.out.println("What is your second test score?");
		grade2 = input.nextDouble();
		System.out.println("What is your third test score?");
		grade3 = input.nextDouble();
		avg = (grade1 + grade2 + grade3) / 3.0;
		if (avg >= 92.5) {
			System.out.println("Your grade is: A");
		}
		else {
		if (avg  >=84.5) {
			System.out.println("Your grade is: B");
		}
		else {
			if (avg >= 77.5) {
			System.out.println("Your grade is: C");
			}
			else {
				if (avg >= 69.5) {
				System.out.println("Your grade is: D"); 
				}
				else {
					System.out.println("Your grade is: F");
				
				}
		
			}
		}
		}
		}
	}


