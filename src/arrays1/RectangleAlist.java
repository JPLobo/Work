package arrays1;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import objectorientedprogram.Rectangle;

public class RectangleAlist {
	public static void main(String[] args) {
		int min =50;
		int max = 70;
		
		Random x = new Random ();
		
		Scanner input = new Scanner(System.in);
		
ArrayList <Rectangle> recs = new ArrayList<Rectangle>(400);
for (int j = 0; j< recs.size(); j++) {
	int width =  min + x.nextInt(max-min + 1);
	 int length=min + x.nextInt(max-min + 1);
	recs.add(new Rectangle(width, length));
	
}
for( int g =recs.size(); g>=0; g-- ) {
	Rectangle are = recs.get(g);
	System.out.println(are.area());
}
Rectangle first = recs.remove(0);
Rectangle Last = recs.remove(recs.size()-1);


}
}