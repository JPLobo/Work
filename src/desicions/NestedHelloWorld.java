package desicions;

import java.util.Scanner;

public class NestedHelloWorld {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int counter = 1;
		int x = 0;
		for (counter = 1; counter <= 5; counter++) {
			for (x = 1; x <= 10; x++) {
				System.out.println(counter + "Hello World");
			}
		}

	}
}
