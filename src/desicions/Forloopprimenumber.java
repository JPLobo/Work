package desicions;

import java.util.Scanner;

public class Forloopprimenumber {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
System.out.println("Enter your number");
double x = input.nextDouble();
double g = 0;
double c = 0;
	for (g = 2; g < x; g++) {
	c = x%g;
		if (c != 0 ) {
			System.out.println("Prime Number!");
		break;
	
}
	if (c == 0)	 
 {
	 
	System.out.println("Not Prime Number!");
	break;
}
		
		}
	input.close();
}
}	


