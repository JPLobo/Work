package arrays1;

import java.util.Scanner;

public class Stringarray2 {
		public static void main(String [] args){
			String [] people = new String [20];
		String letter = new String();

		Scanner input = new Scanner(System.in);
		for (int x = 0; x< people.length; x++ ) {
		
	System.out.println("Enter your friends names!");
		people [x] = input.nextLine();
		}
		System.out.println("Enter your letter");
		letter = input.nextLine();
		System.out.println("Friends name that end with " + letter);
		for (int x = 0; x<people.length; x++) {
			if (letter.charAt(0) == people[x].charAt(people[x].length() - 1)) {
				System.out.println(people[x]);
			}
		}
}
}
		