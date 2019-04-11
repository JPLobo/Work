package inheritance;

public class Quad {
private double side1;
private double side2;
private double side3;
private double side4;

public Quad () {
	side1 = 5;
	side2 = 10;
	side3 = 15;
	side4 = 20;
}
public Quad (double side1x, double side2x, double side3x, double side4x) {
	side1 =side1x;
	side2 = side2x;
	side3 = side3x;
	side4 = side4x;
	
}
public void setside1 (double side1y) {
	side1 = side1y;
}
public void setside2 (double side2y) {
	side2 = side2y;
}
public void setside3 (double side3y) {
	side3 = side3y;
}
public void setside4 (double side4y) {
	side4 = side4y;
}
public double getside1 () {
	return side1;
}
public double getside2 () {
	return side2;
}
public double getside3 () {
	return side3;
}
public double getside4 () {
	return side4;
}
public double perimeter () {
	return side1 + side2+ side3+ side4;
}
public String toString () {
	return "Quadrilateral" + " side 1: " + side1 + " side 2: " + side2 + " side 3: " + side3 + " side 4: " + side4;
}
}
