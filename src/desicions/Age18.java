package desicions;
import java.util.Scanner;
public class Age18 {
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		int age = 10;
		System.out.println("What is your age?");
		age = input.nextInt();
	if (age>=18) {
		System.out.println("you will be charged as an adult!");
	}
	System.out.println("Have a nice day Brother!");
}
}
