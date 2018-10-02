package math;
import java.util.Scanner;
public class coins {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
int cents = 99;
int dollar = 99;
int quarter = -99;
int penny = -99;
int dime = -99;
int nickel = -99;
System.out.println("How much change do you have (in cents)?");
cents = input.nextInt();
dollar = cents / 100;
quarter = cents %100/ 25;
dime = cents %100 % 25 / 10;
nickel = cents%100 % 25 % 10 /5;
penny = cents %100 % 25 % 10 % 5/ 1;
System.out.println("Your change is:" + dollar  +" dollar(s)  "+ quarter +" quarter(s)  " +dime +" dime(s)  " +nickel +" nickel(s)  " +penny + " penny(ies)");
	}
}
