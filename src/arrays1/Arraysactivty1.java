package arrays1;

import java.util.Scanner;

public class Arraysactivty1 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int x = 0;
		double[] scores = new double[5];
		for(int i =0; i<5; i++) {
		System.out.println("Enter your test scores");
		scores[i]=input.nextDouble();
		}
		for (int j = 4; j>-1; j--) {
		System.out.println(scores[j]);
		}
		
		
	}

}
