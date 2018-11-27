package desicions;

import java.util.Scanner;

public class forloop5 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
System.out.println("How many hellos do you want?");
int x = input.nextInt();
int g = 0;
for ( g = 1; g <= x;  g++) {
	System.out.println(g + "Hello");
}

}
}
