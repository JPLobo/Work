package desicions;
import java.util.Scanner;
public class Magicnumba {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
int magicnumber = 76;
int guess = 76;
System.out.println("Guess the magic number!");
guess = input.nextInt();
if (guess == 76) {
	System.out.println("You guessed the number");
	
}
else System.out.println("You were wrong");

}
}