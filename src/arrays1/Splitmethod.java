package arrays1;

import java.util.Scanner;

public class Splitmethod {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your sentence");
		String sentence = new String();
		sentence = input.nextLine();
		System.out.println("Enter a keyword");
		String key = input.nextLine();
		int counter =0;
		String [] words = sentence.split(" ");
		for (int j = 0; j<words.length; j++) {
			if (words[j].contains(key)) {
				counter++;
				
			}
		}
			
		System.out.println("Amount of times " + key + " apeared in sentence " + counter);
		}
		
		
		
}
