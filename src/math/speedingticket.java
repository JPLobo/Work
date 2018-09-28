package math;
import java.util.Scanner;
public class speedingticket {
	public static void main(String [] args){
int limit = -999;
int speed = -999;
int bill1 = -999;
int bill = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the speed limit?");
limit = input.nextInt();
System.out.println("What was your speed");
speed = input.nextInt();
bill1 = speed - limit; 
bill = (bill1- 1) * 40 + 55;
System.out.println("Your ticket is:" + bill );

	}
}
