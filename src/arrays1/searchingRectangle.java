package arrays1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import objectorientedprogram.Rectangle;

public class searchingRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random x = new Random();
		int min = 0;
		int counter =0;
		int max = 499;
		 ArrayList<Rectangle> list = new ArrayList<Rectangle>();
		 for( int j = 0; j<100; j++) {
			 Rectangle g =new Rectangle((min + x.nextInt(max - min + 1)),(min + x.nextInt(max - min + 1)));
			list.add(g); 
		 }
for( int d = 0; d<list.size(); d++) {
	if(list.get(d).returnWidth() == 10) {
		counter++;
	}
}
System.out.println("Number of rectangles that have width of 10: " + counter);
}
}