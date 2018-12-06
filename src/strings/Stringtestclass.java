package strings;

public class Stringtestclass {
	public static void main(String [] args){
		Essaytestexample bob = new Essaytestexample();
		bob.setname("John Wick");
		bob.settext("Lets get this epic vicroy");
		System.out.println("Authors last name " +bob.authorsname());
		System.out.println("Authors charecters in first name " +bob.firstname());
		System.out.println("Does authors name contain X " + bob.predicate());
		System.out.println("Words in essay " +bob.words());
		
	}

}
