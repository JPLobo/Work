package strings;
import java.util.Scanner;
public class String2 {
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
System.out.println("Please enter a sentence");
String sentence = input.nextLine();
System.out.println(sentence.charAt(0));
System.out.println(sentence.charAt(2));
System.out.println(sentence);
}
}