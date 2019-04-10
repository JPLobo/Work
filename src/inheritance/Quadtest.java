package inheritance;

public class Quadtest {
public static void main (String[]args) {
	IRectangle box = new IRectangle();
	System.out.println(box.perimeter());
	System.out.println(box.Area());
	
	IRectangle boxy = new IRectangle (10, 20);
	System.out.println(boxy.perimeter());
	System.out.println(boxy.Area());
Trapezoid xd = new Trapezoid();	
}
}
