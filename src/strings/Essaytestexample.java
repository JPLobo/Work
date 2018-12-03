package strings;

public class Essaytestexample {
	private String name; 
	private String text;
	public Essaytestexample() {
		name = "John smith";
		text = " big body range pull up in a tank";
		
	}
	public void setname(String x) {
		text = x;
	}
	public void settext(String y) {
		name = y;
	}
	public String authorsname () {
		String bill = name.substring(name.indexOf(" "), name.length());
		return bill.toUpperCase();
	}
	public int firstname() {
		String joe = name.substring(0, name.indexOf(" "));
		return joe.length();
	}
	public boolean predicate() {
		if (name.contains("X")) {
		return true;
		}
		else {
			return false;
		}
		
			
		}
			
	}
	
	
	



	



