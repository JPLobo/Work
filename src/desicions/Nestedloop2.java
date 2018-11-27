package desicions;

import java.util.Scanner;

public class Nestedloop2 {public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
int x = 0;
int counter = 0;
int total = 0;

for( counter = 1; counter <=4; counter++) {

for (x= 1; x<=5; x++) {
	  total = counter* x;
	System.out.print(total);

}
System.out.println( " ");
}
}
}