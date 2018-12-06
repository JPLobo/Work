package strings;
import java.util.Scanner;
public class Stringpassword {
	public static void main(String [] args){


	Scanner input = new Scanner(System.in);

	System.out.println("Enter your password");

String a = input.nextLine();
System.out.println("Confirm your password");
String b = input.nextLine();
while (a.compareTo(b)!= 0) {
	System.out.println("incorrect password");
	System.out.println("Confirm your password");
	b = input.nextLine();
}
System.out.println("Correct password");

}
}