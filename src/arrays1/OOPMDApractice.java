package arrays1;

import java.util.Random;
import java.util.Scanner;

import objectorientedprogram.Circle;


public class OOPMDApractice {
	public static void main(String [] args){
		int min = 0;
				int max = 100;
				
				Random x = new Random ();
				
	
		Scanner input = new Scanner(System.in);
		Circle[][] radii = new Circle[18][5];
		for (int row = 0; row<radii.length; row++) {
			for (int column= 0; column<radii[0].length; column++) {
				radii[row][column] = new Circle(min + x.nextInt(max-min + 1));
			}
		}
		
		
		
	}

}
