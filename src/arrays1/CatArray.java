package arrays1;

import java.util.Random;

import objectorientedprogram.CatStart;



public class CatArray {
	public static void main(String[] args) {
		Random x = new Random();
		int min = 0;
		int max = 100;
	CatStart [] people = new CatStart [100];
		CatStart smallest = people[0];
			CatStart Largest = people [0];
		for (int g =0; g<people.length; g++) {
			people [g] = new CatStart(min + x.nextInt(max - min + 1), min + x.nextInt(max - min + 1));
		}
		for( int h = 0; h<people.length; h++) {
			if (smallest.compareTo(people[h])<0) {
				smallest = people [h];
			}
		}
		for (int i =0; i<people.length; i++) {
			if (Largest.compareTo(people[i])>0) {
				Largest = people [i];
			}
		}
		
		System.out.println("Largest Cat" + Largest + "Smallest Cat"+ smallest);
	}
}


