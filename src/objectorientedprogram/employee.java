package objectorientedprogram;

public class employee {
	private double wage;
	private double xp;
public employee() { 
	wage = 10.5;
	xp = 5.25;
	}
public double getWage() {
	return wage;
}
public double getXp() {
	return xp;
}
public void setXP( double nice) {
	xp = nice;
}
public void setWage(double newW) {
	wage = newW;
}
public void wageRaise (double num) {
	wage = wage * 1.1;
}
}
