package desicions;
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int salary = -99;
		System.out.println("What is your salary");
		salary = input.nextInt();
		if (salary <= 20000) {
			System.out.println("You are a worker");
			}
		else {
			if (salary <= 40000) {
				System.out.println("You are a manager");
			}
			else {
				if (salary<= 100000) {
					System.out.println("You are an owner");
				
				}
				else {
					System.out.println("You are an owner");
				}
			}
		}
		
		
}
}