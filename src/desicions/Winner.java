package desicions;
import java.util.Scanner;
public class Winner {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Double money = 9.9;
		System.out.println("How much money did you get?");
		money = input.nextDouble();
		if (Math.abs(money - Math.sqrt(84.3))< 0.0001) {
		System.out.println("You win 18 jars of pickles");
		}
		else {
			System.out.println("you win a pile of garbage");
		}
}
}
