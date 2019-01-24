package arrays1;

import java.util.Scanner;

public class Arraystring3 {
		public static void main(String [] args){
			String [] people = new String [20];
		

		Scanner input = new Scanner(System.in);
		for (int x = 0; x< 20; x++ ) {
		
	System.out.println("Enter your friends names!");
		people [x] = input.nextLine();
		}
		System.out.println("How many letters should name have");
		int g = input.nextInt();
		System.out.println("Friends names with " + g + " letters" );
		for (int j = 0; j < people.length; j++) {
			if (people[j].length() == g) {
				System.out.println(people[j]);
			}
		}
		
}
}