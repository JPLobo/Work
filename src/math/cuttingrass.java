package math;
import java.util.Scanner;
public class cuttingrass {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
double width = -99.0;
double length = -99.0;
double radius = -99.0;
double intarea = -99.0;
double area = -99.0;
double fount = -99.0;
double end = -99.0;
System.out.println("What is the length of the yard?");
length = input.nextDouble();
System.out.println("What is the width of the yard?");
width = input.nextDouble();
System.out.println("What is the radius of the fountain?");
radius = input.nextDouble();
intarea = width*length;
fount = (radius * radius) * Math.PI;
area = intarea - fount;
end = area/100*1.25;
System.out.println("Money Earned: $"+ end);
input.close();
	}

}
