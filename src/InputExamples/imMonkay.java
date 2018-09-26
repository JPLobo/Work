package InputExamples;
import java.util.Scanner;
public class imMonkay {
	public static void main(String [] args){
		int height = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("Height of an adult Monkay?");
		height = input.nextInt();
		System.out.println("Monkay height is" + height);
	}

}
