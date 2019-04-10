package inheritance;

public class Trapezoid extends Quad implements Geo{
	private double height;
	public Trapezoid () {
		super();
		super.setside1(8);
		super.setside2(5);
		super.setside3(8);
		super.setside4(10);
		 height = 5;
	}
	public Trapezoid (double slant, double top, double slant2, double bottom, double xheight) {
		super();
		super.setside1(slant);
		super.setside2(top);
		super.setside3(slant2);
		super.setside4(bottom);
		height = xheight;
	}
	public double Area() {
		return ((getside2()+getside4())/2)* height;
	}


}
