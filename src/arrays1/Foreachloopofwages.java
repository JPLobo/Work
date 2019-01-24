package arrays1;

import java.util.Scanner;

public class Foreachloopofwages {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many employees?");
		int o = input.nextInt();
		Double[] wages = new Double [o];
	int sum = 0;
	for (int x = 0; x< wages.length; x++) {
		System.out.println("Enter your wages of employees");
		wages[x] = input.nextDouble();
	}
	

}
}