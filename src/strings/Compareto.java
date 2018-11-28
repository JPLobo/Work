package strings;

import java.util.Scanner;

public class Compareto {public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter your sentence");
	String sentence = input.nextLine();
	System.out.println("Enter another sentence");
	String sentence2 = input.nextLine();
	System.out.println(sentence.compareTo(sentence2));

}
}