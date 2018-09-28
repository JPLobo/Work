package math;
import java.util.Scanner;
public class shperevolume {
	public static void main(String [] args){
		double radius = -999.9;
		double volume = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the sphere?");
		radius = input.nextDouble();
		volume = (4.0/3.0)*(Math.PI)*(radius*radius*radius);
		System.out.println("The volume of the sphere is "+volume);
		input.close();
	}

}
