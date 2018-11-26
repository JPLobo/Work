package rng;

import java.util.Random;

public class Coinflip {public static void main(String [] args){
int g= 0;
int h = 0;
int y = 0;
Random x = new Random ();
int min = 1;
int max = 2;
int randomNum = min + x.nextInt(max-min + 1);
for (y =1; y <= 100000; y++) {
	randomNum= min + x.nextInt(max-min + 1);
	if( randomNum == 1) {
	g++;
	}
	else {
		h++;
	
	}
	
}
System.out.println("Heads: " + g);
System.out.println("Tails: " + h);
}
}


