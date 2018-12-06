package strings;

import java.util.Scanner;

public class Contains {
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
System.out.println("Enter your sentence");
String sentence = input.nextLine();
System.out.println("Bob is in the sentence " + sentence.contains("Bob"));

		
}
}