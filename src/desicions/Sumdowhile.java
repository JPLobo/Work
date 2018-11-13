package desicions;

import java.util.Scanner;

public class Sumdowhile {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number (999 to cancel)");
	int x = input.nextInt();
	int z = 0;
	int a = 0;
	if (x != 999) {
	do {
		
	System.out.println("Please enter the second number");
	int g = input.nextInt();
	z = g + x;
	a = 999;
	}
	while (a != 999);
	}
	
	System.out.println(z);
}
}
