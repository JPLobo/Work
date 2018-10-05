package math;
import java.util.Scanner;
public class areacircle {
	public static void main(String [] args){
		double radius = -999.0;
		double area = -999.0;
Scanner input = new Scanner(System.in);
System.out.println("What is the radius of the circle?");
radius = input.nextDouble();
area = radius * radius;
area = area * 3.14;
System.out.println("Area:" + area);
	}
}
