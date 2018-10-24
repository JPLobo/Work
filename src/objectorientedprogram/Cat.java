package objectorientedprogram;

public class Cat {
	private double age = 6;
	private double sleep = 13;
	
public Cat() {
	
}
public double setBirthday() {
	return age++;
}
public double sleepPlus() {
	return sleep++;
}
public double sleepMinus() {
	return sleep--;
}
}