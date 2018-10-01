package math;
import java.util.Scanner;
public class trip {
	public static void main(String [] args){
Scanner input = new Scanner(System.in);
int distance = -999;
int fuel = -999;
int money = -999;
int avgcost = -999;
int gallons = -999;
System.out.println("What was the distance?");
distance = input.nextInt();
System.out.println("What was the MPG of the car?");
fuel = input.nextInt();
System.out.println("What was the total money spent on gas?");
money = input.nextInt();
gallons = distance / fuel;
avgcost = money / gallons;
System.out.println("Distance traveled:  " + distance);
System.out.println("Money spent on gas: " + money);
System.out.println("Gallons used: " + gallons);
System.out.println("Average cost of gas: "+ avgcost);
	}

}
