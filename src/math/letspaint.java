package math;
import java.util.Scanner;
public class letspaint {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
int length = -99;
int width = -99;
int area = -99;
int gallon = -99;
System.out.println("What is the width of the room?");
width = input.nextInt();
System.out.println("What is the length of the room?");
length = input.nextInt();
area = (width *8 * 2) +  (length * 8 * 4);
gallon = area / 150;
System.out.println("Width: " + width + " Length: " + length + " height: " + "8");
System.out.println("area is:" + area);
System.out.println("Number of gallons" + gallon);
input.close();
	}
}
