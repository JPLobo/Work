package inheritance;

public class BinaryIntTest {
	public static void Test() {
		Binaryint bob = new Binaryint(223); 
		Binaryint sue = new Binaryint(301);
		Binaryint fred = new Binaryint(210);
		Binaryint john = new Binaryint(212);
		bob.binarytoint(223); 
		sue.binarytoint(301);
		fred.binarytoint(210); 
		john.binarytoint(212);
		int  h =bob.binaryplusbinary(223 , 301); 
		 int p =fred.binaryplusbinary(210,212);
		sue.greaterthan(h,p); // returns positive if h> p negative if p>h

	}
}
