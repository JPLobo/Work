package arrays1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import objectorientedprogram.Rectangle;

public class Listset {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int min = 50;
		int max = 70;

		Random x = new Random();

		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		for (int j = 0; j < 10; j++) {
			int width = min + x.nextInt(max - min + 1);
			int length = min + x.nextInt(max - min + 1);
			recs.add(new Rectangle(width, length));
		}
		Rectangle j = recs.remove(recs.size()-1);
		recs.set(0, j);
		for (int g = recs.size()-1; g >= 0; g--) {
			Rectangle are = recs.get(g);
			System.out.println(are.area());

		}

	}
}