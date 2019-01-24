package arrays1;

import java.util.Scanner;

public class Arraylength {public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	int x = 0;
	double[] scores = new double[5];
	for(int i =0; i<scores.length; i++) {
	System.out.println("Enter your test scores");
	scores[i]=input.nextDouble();
	}
for (x = 0; x<scores.length; x++) {
	System.out.println(scores[x]);
	
	
}


}
}