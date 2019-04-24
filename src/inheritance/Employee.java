package inheritance;
import java.util.Random;
public class Employee {
private String name;
private double rate;
private double [] hours = new double [52];
private static int id = 0;
private int num = 0;

public Employee () {
	Random x = new Random();
	name = "John Wick";
	rate = 10;
int	min = 0;
int max =40;
	for (int i = 0; i< hours.length; i++) {
		hours [i] = min + x.nextInt(max-min + 1);
		}
	num = id;
	}
public void modifyrate(double change) {
}}

