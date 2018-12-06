package strings;

public class Passwordassesment {
	private String pass;
	private boolean valid;
	private boolean validswag;
	
	public Passwordassesment() {
		pass = "1aaaaa!?";
		
	}
	public boolean setpass(String x) {
		
		if(x.contains(" ")) {
			valid = false;
		}
		else {
			if(x.charAt(0) >='0' &&  x.charAt(0) <='9') {
				valid = false;
			}
				else {
					
				}
			if (x.contains("!") && x.contains("?")) {
				if(x.length() > 7  && x.length()<22) {
				
							pass= x.substring(x.indexOf(":") + 1 );
							 valid = true;
				}
						}
						}
		return valid;
					
				
		
	}
		public boolean match(String y) {
			
			if(pass.compareTo(y)== 0) {
				validswag = true;
			}
			else {
				validswag = false;
			}
			return validswag;
		}
			
			
			
			
			
	
			}
		

	
	


