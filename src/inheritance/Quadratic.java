package inheritance;

import java.util.ArrayList;

public class Quadratic implements Polynomial{
	private ArrayList <Monomial> term;
	
public Quadratic( ArrayList<Monomial> t ) {
	term = t;
}
public int getDegree() {
	return 2;
}
public int geterm () {
	return term.size();
}
public String getname() {
	String [] names = {"Quadratic monomial" + "Quadratic Binomial" + "Quadratic Trinomial" };
	return names [getDegree() -1];
}
public boolean roots(double x, double y, double z) {
	double root =y*y -4 *x* z;
	if (root >= 0) {
		return true; 
	}
			return false;
	}
public double[] getroots() {
	double x= 0;
	double y=0; 
	double z=0;
	double [] root = new double [2];
	x = term.get(0).getCoefficient();
	if (term.size() == 3) {
		y = term.get(1).getCoefficient();
		z = term.get(2).getCoefficient();
	}
	else if (term.size() == 2) {
		if (( term.get(1)).getDegree() ==1) {
			y = term.get(1).getCoefficient();
		}
		else {
			z = term.get(1).getCoefficient();
		}
	}
	if (!roots(x,y,z)) {
		return null;
	}
	root[0] = (-y + Math.sqrt(Math.pow(y, 2)- 4 * x * z)) / (2* x);
	root[1] = (-y - Math.sqrt(Math.pow(y, 2)- 4 * x * z)) / (2* x);
	return root;
}

}