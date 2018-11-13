package desicions;

import java.util.Scanner;

public class forlloop9 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
int x = 0;
int g = 0;
int f = 0;
for (x = 1; x <=5; x++) {
	System.out.println("Enter your number");
	g = input.nextInt();
	f = f + g;
}
System.out.println(f);
}
}