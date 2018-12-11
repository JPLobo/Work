package arrays1;

import java.util.Random;
import java.util.Scanner;

public class Rolladie {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int max = 6;
				int min = 1;
				Random x = new Random ();
				int randomNum = min + x.nextInt(max-min + 1);
double [] rolls = new double[10000];
System.out.println("What number do you want to count?");
int numba = input.nextInt();
int counter = 0;
for (int i = 0; i<10000; i++) {
	rolls[i] =  randomNum = min + x.nextInt(max-min + 1);
	if (rolls[i] == numba) {
		counter++;
	}
}
System.out.println("You rolled " + numba +" " + counter + " times");
}
}