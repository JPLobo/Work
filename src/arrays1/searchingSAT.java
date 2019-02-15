package arrays1;
import java.util.ArrayList;
import java.util.Random;
public class searchingSAT {
	public static void main(String[] args) {
		
	Random x = new Random();
ArrayList<Integer>scores = new ArrayList<Integer>();
	int min = 0;
	int max = 1500;
	
	for(int j =0; j<scores.size() - 1; j++) {
		scores.add(min + x.nextInt(max - min + 1));
	}
	int search = (min + x.nextInt(max - min + 1));
	boolean plug = false;
	for(int g = 0; g<scores.size(); g++) {
		if (scores.get(g) == search) {
			plug = false;
			break;
		}
		System.out.println("is"+ search + "in the arrraylist" + plug);
	}	
}
}