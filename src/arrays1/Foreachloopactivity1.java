package arrays1;

import java.util.Scanner;

public class Foreachloopactivity1 {
	public static void main(String [] args){
		int[] students = new int [20];
	
int sum = 0;
	Scanner input = new Scanner(System.in);

	for (int x : students ) {
		
		System.out.println("Enter your students age");
			students [x] = input.nextInt();
	
	}
	for (int j : students) {
		sum = sum + j;
	}
	System.out.println(sum);
}
}