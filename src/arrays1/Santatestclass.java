package arrays1;

import java.util.Scanner;

public class Santatestclass {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int x = 0;
		int age = 0;
		String name = "johnwick";
		boolean record = false;
		boolean [] counter = new boolean[100000];
		Santaclass bob = new Santaclass();
		for (x = 0; x< 100000; x++) {
			bob.fortnite(age,name,record);
			age = input.nextInt();
			name= input.nextLine();
			record = input.nextBoolean();
			if (bob.employable() == true) {
				counter[x] = true;
			}
			else {
				counter [x] = false;
			}
			
			
			
			
			
		}
		
		
		
		
}
}