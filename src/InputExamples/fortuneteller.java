package InputExamples;
import java.util.Scanner;
public class fortuneteller {
	public static void main(String [] args){
		int age = 999;
		int weight = 999;
		int lucknum = 999;
Scanner input = new Scanner(System.in);



System.out.println("Enter your weight");
weight = input.nextInt();
System.out.println("Enter your age");
age = input.nextInt();
System.out.println("Enter your lucky number");
lucknum = input.nextInt();
System.out.println("in the future...");
System.out.println("I see...");
System.out.println(lucknum + "years from now");
System.out.println("You will reside" + age + weight + ("   at the old folks home"));
input.close();
	}
}
