package arrays1;

import java.util.Scanner;

public class Largestvalueinarray {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int x = 0;
		double p = 0.0;
		double[] scores = new double[10];
		for(int i =0; i<10; i++) {
		System.out.println("Enter your test scores");
		scores[i]=input.nextDouble();
		}
		for (x=0; x<10; x++) {
			if (p < scores[x])
			p = scores[x];
			
		}
System.out.println(p);
}
}