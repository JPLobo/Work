package desicions;
import java.util.Scanner;
public class Pets {
	public static void main(String [] args){
		
	
		Scanner input = new Scanner(System.in);
		int pets = 15;
		int cars = 15;
		System.out.println("How many cars fit in your garage?");
		cars = input.nextInt();
		System.out.println("How many pets do you have?");
		pets = input.nextInt();
		System.out.println(pets> 5 || cars> 3);
}
}