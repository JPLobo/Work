package arrays1;

import java.util.Random;

import objectorientedprogram.Rectangle;

public class OOPMDArectangle {
	public static void main(String[] args) {
		int min = 0;
		int max = 100;
		int sum = 0;
		Random x = new Random();
		Rectangle[][] MDA = new Rectangle[3][5];
		for (int row = 0; row < MDA.length; row++) {
			for (int column = 0; column < MDA[0].length; column++) {
				MDA[row][column] = new Rectangle(min + x.nextInt(max - min + 1), min + x.nextInt(max - min + 1));
				sum += MDA[row][column].perimeter();
			}

		}
	}

}
