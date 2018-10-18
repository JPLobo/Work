package objectorientedprogram;

public class Rectangle {
	private double length = -99.0;
	private double width = -99;

	public Rectangle() {

	}

	public Rectangle(double length1, double width2) {
		length = length1;
		width = width2;
	}

	public double returnLength() {
		return length;
	}

	public double returnWidth() {
		return width;
	}

	public double area() {
		double area = length * width;
		return area;
	}

	public double perimeter() {
		double perimeter = (length + width) * 2;
		return perimeter;
	}

	public void setLength(double xlength) {
		length = xlength;
	}

	public void setWidth(double xwidth) {
		width = xwidth;
	}
}
