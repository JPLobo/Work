package strings;

public class Essaytestexample {
	private String name; 
	private String text;
	public Essaytestexample() {
		name = "John smith";
		text = " big body range pull up in a tank";
		
	}
	public void setname(String x) {
		name = x;
	}
	public void settext(String y) {
		text = y;
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
		public int words() {
			int word = 1;
			for(int i = 0; i<text.length(); i++) {
				if(text.charAt(i) ==' ') {
					word++;
					
				}
				
			}
			return word;	
				
		}
			
		}
			
	
	
	
	



	



