package InputExamples;
import java.util.Scanner;
public class ageweight {
	public static void main(String [] args){
		int age = 999;
		int weight = 999;
Scanner input = new Scanner (System.in);
System.out.println("what is your age?");
age = input.nextInt();
System.out.println("what is your weight?");
weight = input.nextInt();
System.out.println("Your age and weight are: " + age + ("years  ") + weight +("lbs") );
input.close();
	}

}
