package strings;
import java.util.Scanner;
public class Sentencestrins {
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String a = input.nextLine();
	int i = 0;
for (i = 0; i< a.length(); i  = i + 4) {
	System.out.println(a.charAt(i));
	
}
}
}