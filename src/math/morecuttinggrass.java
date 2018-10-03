package math;
import java.util.Scanner;
public class morecuttinggrass {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double finaltime = 99.0;
double width = 99.0;
double length = -99.0;
double deck = -99.0;
double mph  = -99.0;
double mower = -99.0;
double area = -99.0;
double time = -99.0;
System.out.println("What is the width of the yard?");
width = input.nextDouble();
System.out.println("What is the legnth of the yard?");
length = input.nextDouble();
System.out.println("What is the mower deck in inches?");
deck = input.nextDouble();
System.out.println("What speed of the mower");
mph = input.nextDouble();
mph = mph*5280/60;
deck = deck /12;
mower = mph*deck;
area = width*length;
time = area / mower / 60;
finaltime= time * 12;
System.out.println("Money earned: $" + finaltime);
System.out.println("Total time cutting grass: "+ time + " Hours");
	}

}
