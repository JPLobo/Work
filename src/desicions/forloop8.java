package desicions;

import java.util.Scanner;

public class forloop8 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
System.out.println("What is your favorite number?");
int x = input.nextInt();
int g = 0;
int j = 0;
for (g= 1; g <= 50; g++) {
	j = x * g + j;
}
System.out.println(j);
}
}