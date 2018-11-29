package strings;

import java.util.Scanner;

public class stringcompareto {public static void main(String [] args){

	Scanner input = new Scanner(System.in);
System.out.println("Enter your sentence");
String a = input.nextLine();
System.out.println("Enter your other sentnce");
String b = input.nextLine();

if (a.compareTo(b) < 0) {
	//compareToIgnorecase
	System.out.println("Sentence: " + a + " comes first");
	}
else {
	if (a.compareTo(b) > 0) {
		System.out.println("Sentence" + b + " comes first");
	}
	else {
		System.out.println("Sentences are equal");
	}
}

}
}