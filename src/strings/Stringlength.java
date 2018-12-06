package strings;

import java.util.Scanner;

public class Stringlength {public static void main(String [] args){

	Scanner input = new Scanner(System.in);
System.out.println("Enter a sentence");
String a = input.nextLine();
int x = a.length();
int g = 0;
for (g = 0; g< x; g++) {
	System.out.println(a.charAt(g));
}
}
}