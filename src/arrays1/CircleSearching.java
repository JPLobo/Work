package arrays1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import objectorientedprogram.Circle;

public class CircleSearching {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random x = new Random();
		int min = 0;
		int counter =0;
		int max = 499;
		 ArrayList<Circle> list = new ArrayList<Circle>();
		 for( int j = 0; j<100; j++) {
			 Circle g =new Circle((min + x.nextInt(max - min + 1)));
			list.add(g); 
}
		 for( int d = 0; d<list.size(); d++) {
				if(Math.abs(list.get(d).area()-list.get(0).area()) <=.00001) {
					counter++;
}
		 }
		 double w = list.get(0).area();
	System.out.println("Number of areas = to "+ w +" "+ counter);	 
	}
	}