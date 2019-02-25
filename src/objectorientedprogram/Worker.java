package objectorientedprogram;

public class Worker {
	private int hours;
	private double rate;

	//constructor(s)
	public Worker(){
	hours = 40;
	rate = 3.50;
	}

	public Worker(int newHours, double newRate){
	hours = newHours;
	rate = newRate;
	}

	public int getHours(){
		return hours;
	}

	public void setHours(int xHours){
		hours = xHours;
	}

	public double getRate(){
		return rate;
	}

	public void setRate(double xRate){
		rate = xRate;
	}

	public double payCheck(){
		return hours * rate;
	}

	public void raise(double amount){
			rate = rate + amount;
	}
}

