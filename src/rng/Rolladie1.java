package rng;

import java.util.Random;
import java.util.Scanner;
public class Rolladie1 {public static void main(String [] args){
	Random x = new Random ();
	Scanner input = new Scanner(System.in);
	int min = 1;
	int max = 6;
	int z =0;
	int l = 0;
	int counter = 0;
	int counter2 = 0;
	int randomNum = min + x.nextInt(max-min + 1);
	for(z = 1; z<= 10000000; z ++) {
		
		for ( l = 1; l <=6; l ++)
			randomNum = min + x.nextInt(max-min + 1);
	randomNum =  counter;
	
	
}
	}
}
