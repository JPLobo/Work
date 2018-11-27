package desicions;

import java.util.Scanner;

public class Mulitplechoice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		int a = 0;
		System.out.println("What number would you like to stop at?");
		i = input.nextInt();
		while (a <= i) {
			System.out.println(a);
			a = a +2;
		}
}

}
