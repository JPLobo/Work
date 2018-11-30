package strings;
import java.util.Scanner;
public class StringsSS {
	public static void main(String [] args){


	Scanner input = new Scanner(System.in);
System.out.println("Enter a sentence");
String a = input.nextLine();
System.out.println("Your Social security number is :");
System.out.print(a.substring(0, 3) + " - ");
System.out.print(a.substring(4,6) + " - ");
System.out.print(a.substring(7,11));

}
}