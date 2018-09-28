package math;
import java.util.Scanner;
public class longdivision {
	public static void main(String [] args){
int dividend = -999;
int divisor = -999;
int answer = -999;
int answer1 = -999;
System.out.println("What is the Dividend?");
Scanner input = new Scanner(System.in);
dividend = input.nextInt();
System.out.println("What is the Divisor?");
divisor = input.nextInt();
answer1 = dividend/divisor;
answer = dividend%divisor;
System.out.println("Your answer is" + answer1 +"r" + answer );
input.close();
	}

}
