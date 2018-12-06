package strings;
import java.util.Scanner;
public class Passwordtestclass {
	public static void main(String [] args){
		Passwordassesment bob = new Passwordassesment();
		Scanner input = new Scanner(System.in);
		int counter1 = 0;
		int counter2 = 0;
		String x = "hi";
		String y = "yoinks";
		boolean finished = false;
		boolean sexbyeden = false;
		while (finished == false) {
		System.out.println("Enter your password in this format: Lastname:password");
		x = input.nextLine();
		x= x.substring(x.indexOf(":") + 1);
		counter1++;
		finished = bob.setpass(x);
		}
		while ( sexbyeden == false) {
		System.out.println("Please confirm your password");
		y= input.nextLine();
		counter2++;
		sexbyeden = bob.match(y);
		}
		
		
	}


}
