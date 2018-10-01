package math;
import java.util.Scanner;
public class testscore {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
int score1 = -999;
int score2 = -999;
int score3 = -999;
int avg = -999;
System.out.println("What was your first score?");
score1 = input.nextInt();
System.out.println("What was your second score?");
score2 = input.nextInt();
System.out.println("What was your third score?");
score3 = input.nextInt();
avg = (score1 + score2 + score3)/3;
System.out.println("Average score: "+ avg);
	}
}
