package desicions;

import java.util.Scanner;

public class Dowhilenumbers {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
System.out.println("Please enter your 1st number!");	
int x = input.nextInt();
int z = 0;
int a = 0;
int g = 0;
do {
	System.out.println("Please enter you next number (9999 to cancel)");
a = input.nextInt();
z = x + a;
g++;
}
while ( a != 9999);
z= z -9999;
if (z > 2018) {
	System.out.println(g);
}
else {
	System.out.println("Try Again!!");
}
}
}
