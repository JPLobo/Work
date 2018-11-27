package desicions;

import java.util.Scanner;

public class Dowhileactivity2 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	double x =9.9;
	double g = 9.9;
	do {
	System.out.println("Please enter a number (9999 to cancel)");
g = input.nextDouble();
x = Math.pow(g, 5);
System.out.println(x);
	}
while(g != 9999 );
}
}
