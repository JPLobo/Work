package objectorientedprogram;

public class Rectangle {
	private int length = -99;
	private int width = -99;

	public Rectangle() {

	}

	public Rectangle(int length1, int width2) {
		length = length1;
		width = width2;
	}

	public int returnLength() {
		return length;
	}

	public int returnWidth() {
		return width;
	}

	public int area() {
		int area = length * width;
		return area;
	}

	public int perimeter() {
		int perimeter = (length + width) * 2;
		return perimeter;
	}

	public void setLength(int xlength) {
		length = xlength;
	}

	public void setWidth(int xwidth) {
		width = xwidth;
	}
}
