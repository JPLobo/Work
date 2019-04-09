package inheritance;

public class Parallelogram extends Quad {
private double height;
	public Parallelogram() {
		super();
		height = 5;
	}
	public Parallelogram (double l, double w, double ht) {
		super (w,l,w,l);
		height = ht;
	}
public double Area() {
	return getside1()*height;
}
public double Perimeter() {
	return getside1()+ getside2()+ getside3() + getside4();
}
}