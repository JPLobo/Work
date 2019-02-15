package arrays1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class searchingTimes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random x = new Random();
	int [] scores = new int [100];
		int min = 0;
		int counter = 0;
		int gamer = 0;
		int max = 1500;
		for(int j =0; j<scores.length; j ++) {
			scores [j] = (min + x.nextInt(max - min + 1));
			}
		System.out.println("what intger would you like?");
		gamer = input.nextInt();
		for(int g =0; g<scores.length; g ++) {
			if (scores[g] == gamer) {
		
					counter ++;
			}
		}
		System.out.println("Times" + gamer +"is in the array" + counter);
}
}