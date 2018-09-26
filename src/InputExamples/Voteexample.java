package InputExamples;
import java.util.Scanner;
public class Voteexample {
	public static void main(String [] args){
boolean vote = true;
Scanner input = new Scanner(System.in);
System.out.println("Did you vote");
vote = input.nextBoolean();
	System.out.println("Your answer is:" + vote);
	}
}
