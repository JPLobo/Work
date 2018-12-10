package arrays1;

import java.util.Scanner;

public class Stringarrays1 {
	public static void main(String [] args){
		String [] people = new String [20];
	

	Scanner input = new Scanner(System.in);
	for (int x = 0; x< 20; x++ ) {
	
System.out.println("Enter your friends names!");
	people [x] = input.nextLine();
	}
	for (int j = people.length- 1; j >=0; j--) {
		System.out.println(people[j]);
	}
	
}
}