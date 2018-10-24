package objectorientedprogram;

public class Righttriangle {
	private double height = 3.0;
	private double base = 4.0;
	private double hypotu = 5.0;

	public Righttriangle(double xheight, double xbase) {
		height = xheight;
		base = xbase;
	}

	public double returnHypot(double c) {
		c = (Math.pow(height, 2) + Math.pow(base, 2));
		return c = Math.sqrt(c);
	}

	public double returnArea() {
		return base * height * .5;
	}

	public double returnPerimeter() {
		return hypotu + base + height;
	}
}
