package InputExamples;
import java.util.Scanner;
public class lockercombo {
	public static void main(String [] args){
int numOne = 999;
int numTwo = 999;
int numThree = 999;
Scanner input = new Scanner (System.in);
System.out.println("What is your locker combo?");
System.out.println("Enter first number");
numOne = input.nextInt();
System.out.println("Enter second number");
numTwo = input.nextInt();
System.out.println("Enter third number");
numThree = input.nextInt();
System.out.println("Your locker combo is:  " + numOne +  ("-") + numTwo + ("-") + numThree);
	}

}
