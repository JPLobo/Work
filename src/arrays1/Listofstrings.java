package arrays1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import objectorientedprogram.Rectangle;

public class Listofstrings {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
ArrayList <String> names = new ArrayList<String>();
names.add("Bob Smith");
names.add("Jane Miller");
names.add(0, "Billy Jones");
System.out.println("What is your name");
names.add(names.size(), input.nextLine());
names.remove(1);
for( int j =0; j<names.size(); j++)
	System.out.println(names.get(j));

}
}