package strings;
import java.util.Scanner;
public class Removespacesstrings {
	public static void main(String [] args){


	Scanner input = new Scanner(System.in);
System.out.println("Enter a sentence");
String a = input.nextLine();
int i = 0;
for (i = 0; i < a.length(); i++) {
	if (a.charAt(i)!='a' && a.charAt(i)!=' ')
	System.out.print(a.charAt(i));
		
		
	}
	

System.out.println(" " + a);
}
}