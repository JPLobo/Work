package desicions;

import java.util.Scanner;

public class Dowileactivity3 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
int x = 9;
int g = 0;
int f = 10000000;
System.out.println("Please enter a number (9999 to quit)");
x = input.nextInt();
g = x;
f = x;
do
{
	if (x > g) {
		x = g;
		}
	if (x< f) {
		f = x;
	}
	System.out.println("Please enter a number (9999 to quit)");
x = input.nextInt();
}
while ( x != 9999);

int y = g - f;
System.out.println(y);
}
}