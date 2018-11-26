package rng;

import java.util.Random;

public class Randomnumber2 {
	public static void main(String [] args){
	Random x = new Random ();
	int min = 1;
	int max = 13;
	int z = 0;
	int multiples = 0;
	int randomNum = min + x.nextInt(max-min + 1);
	for (z = 1; z< 87; z++) {
		randomNum = min + x.nextInt(max-min + 1);
		if (randomNum % 3 ==0) {
			multiples++;
		}
	}
	System.out.println(multiples);
}
}