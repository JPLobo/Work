package objectorientedprogram;

import java.util.Scanner;

public class testclass3 {
	public static void main(String [] args){
		sandbox bob = new sandbox();
	
		Scanner input = new Scanner(System.in);
		System.out.println( "What is the length of the sandbox?");
		double length = input.nextDouble();
		System.out.println( "What is the width of the sandbox?");
		double width = input.nextDouble();
		System.out.println( "What is the depth of the sandbox?");
		double depth = input.nextDouble();
		System.out.println( "How much sand can you move per hour?");
		double rate = input.nextDouble();
		double volume = length * width * depth;
		double time = volume / rate;
	bob.set2(length, width, rate, depth , volume, time);
		
	}

}
