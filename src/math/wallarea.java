package math;
import java.util.Scanner;
public class wallarea {
	public static void main(String [] args){
int length = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the length of the wall?");
length = input.nextInt();
System.out.println("The area of the wall is:" + length * 8);
	}

}
