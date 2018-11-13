package desicions;

import java.util.Scanner;

public class Dowhileactivity1 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int x = 99;
	int g = 99;
	do {
	System.out.println("Please enter a number (9999 to quit)");
	x = input.nextInt();
	g = x * 17;
	System.out.println(g);
	}
	while (x != 9999);
	
}

}
