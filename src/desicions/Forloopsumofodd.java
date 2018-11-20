package desicions;

import java.util.Scanner;

public class Forloopsumofodd {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
System.out.println("Enter your even number!");
int x =input.nextInt();
int g = 0;
int total = 0;
for (g = 1; g<= x; g = g + 2) {
	total = total + g;
}
System.out.println(total);
}
}