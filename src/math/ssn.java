package math;
import java.util.Scanner;
public class ssn {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
int age = -99;
int ssn = -99;
int timeleft = -99;
int sss = -99;
System.out.println("What is your age?");
age = input.nextInt();
System.out.println("What is your Social Security Numbers?");
ssn = input.nextInt();
timeleft = 18 - age;
System.out.println("Your age:" + age);
System.out.println("Years until you can vote: " + timeleft);
sss = ssn % 10000;
System.out.println("Last digits of your SSN number: "+ sss);
input.close();
	}

}
