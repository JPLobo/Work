package desicions;

import java.util.Scanner;

public class Dowhilecircle {
	private double radius;
	Scanner input = new Scanner(System.in);

	public Dowhilecircle() {

	}

	public Dowhilecircle(double radius1) {
		radius = radius1;

	}

	public double returnRadius() {
		return radius;
	}

	public double circumfrence() {
		double circ = 2 * Math.PI * radius;
		return circ;
	}

	public double area() {
		double area = radius * radius * Math.PI;
		return area;
	}

	public void setRadius(double change) {
		radius = radius;

	}
}
