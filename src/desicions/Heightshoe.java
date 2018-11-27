package desicions;
import java.util.Scanner;
public class Heightshoe {
	public static void main(String [] args){
		
	
		Scanner input = new Scanner(System.in);
		int shoeSize = 15;
		int height = 15;
		System.out.println("What is your shoe size?");
		shoeSize = input.nextInt();
		System.out.println("What is your height?");
		height = input.nextInt();
		System.out.println(height< 62 && shoeSize > 9);
	}
}