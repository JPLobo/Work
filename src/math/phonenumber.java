package math;
import java.util.Scanner;
public class phonenumber {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
int number1 = -99;
int phonenumber = -99;
int number2 = -99;
int number3 = -99;
int number4 = -99;
int number5 = -99;
int number6 = -99;
int number7 = -99;
int number8 = -99;
int number9 = -99;
int number10 = -99;
System.out.println("What is your phone number?");
phonenumber = input.nextInt();
number1 = phonenumber / 10000000;
number2 = phonenumber/ 10000 % 1000;
number3 = phonenumber % 10000;
System.out.println("Area code is: "+ number1);
System.out.println("Middle digits: "+ number2);
System.out.println("End digits: "+ number3);
		}
}
