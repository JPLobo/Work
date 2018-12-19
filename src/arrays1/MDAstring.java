package arrays1;

import java.util.Scanner;

public class MDAstring {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
String[][]Names = new String[4][3];
for (int row = 0; row<Names.length; row++) {
	for(int column = 0; column<Names[0].length; column++) {
		System.out.println("Enter your names!");
		Names[row][column] = input.nextLine();
		
	}
	
}
		
		
}
}