package inheritance;

public class IRectangle extends Parallelogram implements Geo{

public IRectangle () {
	super();
	super.setside1(5);
	super.setside2(10);
	super.setside3(5);
	super.setside4(10);
}
public IRectangle (double l, double w) {
	super();
	super.setside1(l);
	super.setside2(w);
	super.setside3(l);
	super.setside4(w);
}

}
