package math;
import java.util.Scanner;
public class busses {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
int people = -99;
int busses = -99;
int vans = 99;
System.out.println("How many people?");
people = input.nextInt();
busses = people / 35;
vans = people % 35;
System.out.println("Busses ordered: "+ busses + " People needed for vans "+ vans);
	}
}
