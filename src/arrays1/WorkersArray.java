package arrays1;

import java.util.Random;

import objectorientedprogram.Worker;

public class WorkersArray {
	public static void main(String[] args) {
		Random x = new Random();
		int min = 0;
		int max = 100;
		double xmin = 0.0;
		double xmax = 100.0;
	Worker [] people = new Worker [100];
		Worker smallest = people[0];
			
		for (int g =0; g<people.length; g++) {
			people [g] = new Worker(min + x.nextInt(max - min + 1), min + x.nextInt(max - min + 1));
		}
		for( int h = 0; h<people.length; h++) {
			if (smallest.compareTo(people[h])<0) {
				smallest = people [h];
			}
		}
		
		
		
	}
}
