package desicions;

import java.util.Scanner;

public class Activity5 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
 int x = 0;
 int c = 0;
 System.out.println("What is your number (9999 to quit)");
 x = input.nextInt();
 while (x != 9999) {
	
	 c = x*2;
	 System.out.println(c);
	 System.out.println("What is your number (9999 to quit)");
	  x = input.nextInt();
 }
}
}