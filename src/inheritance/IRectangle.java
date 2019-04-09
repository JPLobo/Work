package inheritance;

public class IRectangle extends Quad{

public IRectangle () {
	setside1(5);
	setside2(10);
	setside3(5);
	setside4(10);
}
public IRectangle (double l, double w) {
	setside1(l);
	setside2(w);
	setside3(l);
	setside4(w);
}
public double Area() {
	return getside1() * getside2();
}
}
