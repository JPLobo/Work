package designingclasses;

import java.util.*;

public class PileOjunk {
	
private static int idnum;
private Random x = new Random ();
private int randomNum;
public PileOjunk () {
	int randomNum = 10 + x.nextInt(100-10 + 1);
	idnum++;
}
public static int sum(int x, int y ) {
	return x + y;
}
public void setter (int randomNum) {
this.randomNum = randomNum;
}
}
