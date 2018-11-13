package desicions;

import java.util.Scanner;

public class forloop11 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
int x = 0;
int y = 0;
int j = 0;
for (x = 1; x<=5; x++) {
	System.out.println("Enter your number");
	y = input.nextInt();
	if (y%2 != 0) {
		System.out.println("Odd");
	}
		else {
			System.out.println("Even");
		}
	}
}

}
