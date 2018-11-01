package desicions;
import java.util.Scanner;
public class Promotion {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int age = 56;
		double height = 9.0;
		double time = 6.0;
System.out.println("What is your age?");
age = input.nextInt();
System.out.println("What is your height?");
height = input.nextDouble();
System.out.println("How many years have you worked for?");
time = input.nextDouble();
if (age >= 50 && Math.abs(time - 10.5) <.001 && height <= 70.0 || height >= 80.0) {
	System.out.println("You get a promotion!");
}

if (age < 50 &&  height >= 70.0 || height <= 80.0) {
	System.out.println("You get a promotion!");
}
	
	}
}
