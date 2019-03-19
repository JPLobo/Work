package arrays1;
import java.util.ArrayList;
	import java.util.Random;
	import java.util.Scanner;
public class Searchingdoubleobjects {
	


		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			Random x = new Random();
			double min = 0;
			int counter =0;
			double max = 499;
			 ArrayList<Double> list = new ArrayList<Double>();
		for(double j =0.0; j<1000.0; j ++) {
			double r = (min + x.nextDouble()*500);
			list.add(r);
}
		System.out.println("What is your number?");
		double user = input.nextDouble();
		for (int p = 0; p<list.size(); p++) {
			if(list.get(p)== user) {
				counter++;
			}
		}
		System.out.println(user + " appears " + counter + " times ");
}
}