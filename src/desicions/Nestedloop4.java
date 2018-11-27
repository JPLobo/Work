package desicions;

import java.util.Scanner;

public class Nestedloop4 {public static void main(String[] args) {
	int answer = 0;
	int j = 0;
	int g = 0;
	int h = 0;
	int counter = 0;
	int largest = 0;
	Scanner input = new Scanner(System.in);
	
	for ( counter= 1; counter<=1000; counter++) {
		h = 0;
	for (g = 1; g <=counter; g++) {
		j = counter%g;
		if (j == 0) {
			h++;
			
		}
		if(h>largest) {
		
			largest =h;
			answer = counter;
		}
		
		
	}
	}
	System.out.println(answer);
}

}
