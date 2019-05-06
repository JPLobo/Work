package inheritance;

public class Binaryint {

	public Binaryint (int xg) {
		
	}
 public void create() {
	int b = 0;
}
 public void binarytoint(int decimel) {
	  int decimal = 0;
	    int p = 0;
	    while(true){
	      if(decimel == 0){
	        break;
	      } else {
	          int temp = decimel%10;
	          decimal += temp*Math.pow(2, p);
	          decimel = decimel/10;
	          p++;
	       }
	    }
 }
 public int binaryplusbinary (int binaryx, int binaryy) {
	 return binaryx+binaryy;
 }
 public String inttostring (int number) {
	 String x = "Binary number:" + number;
	 return x;
 }
 public int greaterthan(int num, int xnum) {
	 if( num >xnum) {
		 return 2;
	 }
	 if (num == xnum) {
		 return 0;
	 }
	 else return -1;
 }
 
}