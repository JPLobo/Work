package math;
import java.util.Scanner;
public class voteactivity {
	public static void main(String [] args){
	int age = 999;
Scanner input = new Scanner(System.in);
System.out.println("What is your Age?");
age = input.nextInt();
age = age - 18;
age = age * -1;
System.out.println("You can vote in: " + age + ("years"));
	}
}
