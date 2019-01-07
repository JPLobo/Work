package arrays1;

import java.util.Scanner;
import java.util.ArrayList;
public class Listloop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
ArrayList <String> bob = new ArrayList<String>();
bob.add("bob");
bob.add("billy");
bob.add("jane");
System.out.println("What is your name?");
bob.add(input.nextLine());
for (int x = 0; x<bob.size() - 1; x++) {
	System.out.println(bob.get(x));
	
}

}
}