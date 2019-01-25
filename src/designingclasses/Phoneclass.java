package designingclasses;

public class Phoneclass {
	private static int number = 1;
	private int pnumber;
	private float mynumber;
	private static final int max = 10000;
	private int minutes;
	
	public Phoneclass(float xnum,int xminutes ) {
		pnumber = number;
		number++;
		mynumber = xnum;
		if (xminutes < max && xminutes >0) {
			minutes = xminutes;
		}
		else {
			minutes = max;
		}
		
	}
	public void makeCall(int yminutes) {
		if (yminutes+minutes <= max) {
			minutes += yminutes;
		}
		}
	public int timeRemaning () {
		return max - minutes;
	}
	public void reset() {
		minutes = 0;
	}
	}


