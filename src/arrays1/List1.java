package arrays1;

import java.util.ArrayList;
import java.util.Scanner;
public class List1 { 
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		ArrayList<String> bob = new ArrayList<String>();
		bob.add("bob");
		bob.add("jane");
		bob.add(1, "Billy");
		System.out.println("Enter you name");
		bob.add(bob.size()- 1, input.nextLine());
		
	


}
}