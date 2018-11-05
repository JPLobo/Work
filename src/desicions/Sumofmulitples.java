package desicions;

import java.util.Scanner;

public class Sumofmulitples {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int i = 0;
	int a = 0;
	System.out.println("What number would you like to stop at?");
	int x = input.nextInt();
	while (x >= i) {
		a += i;
		i = i+2;
	}
	System.out.println(a);
}
}