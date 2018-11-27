package rng;
import java.util.Random;
public class Randomnumber1 {
	public static void main(String [] args){
		
	
Random x = new Random ();
int min = 0;
int max = 100;
int randomNum = min + x.nextInt(max-min + 1);
System.out.println("A random number between " + min + " and "+ max);
System.out.println("is: " + randomNum);
}
}