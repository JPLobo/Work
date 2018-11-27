package rng;

import java.util.Random;

public class Randomnumber3 {public static void main(String [] args){
	Random x = new Random ();
	int min = 26;
	int max = 43;
	int z =0;
	int j =0;
	int randomNum = min + x.nextInt(max-min + 1);
	for(z = 1; z<= 248; z ++) {
		randomNum = min + x.nextInt(max-min + 1);
		if (randomNum >= 36) {
			j ++;
		}
	}
	System.out.println("Kids 3ft+" + j);
}
}