package inheritance;

import java.util.ArrayList;

public class Geotestclass {
public static void main(String[]args) {
	double areaa =0;
	double areap =0;
	double perimetera = 0;
	double perimeter =0;
	ArrayList <Geo> shap = new ArrayList<Geo>();
	shap.add(new IRectangle(10.0, 5.0));
	shap.add(new IRectangle(15.0, 10.0));
	shap.add(new IRectangle(20.0, 15.0));
	shap.add(new Trapezoid(10.0, 5, 10.0, 8.0, 5.0));
	shap.add(new Trapezoid(5.0, 2.5, 5.0, 4.0, 2.5));
	shap.add(new Trapezoid(20.0, 10.0, 20.0, 16.0, 10.0));
	for (Geo temp: shap) {
		if (temp instanceof IRectangle) {
			if( temp.Area() > areaa) {
				areaa = temp.Area();
			
			}
			if (temp.perimeter() > perimetera) {
				perimetera = temp.perimeter();
			}
		}
		if ( temp instanceof Trapezoid) {
			if (temp.perimeter() > perimeter) {
				perimeter = temp.perimeter();
			}
		
			if( temp.Area() > areap) {
				areap = temp.Area();
		}
		}
	}
		if (areap> areaa) {
			System.out.println("Largest area is Trapezoid and its area is:" + areap);
		}
		else {
			System.out.println("Largest area is Rectangle and its area is:" + areaa);
		}
		if (perimeter > perimetera) {
			System.out.println("Largest perimeter is Trapezoid and its perimeter" + perimeter);
		}
		else {
			System.out.println("Largest perimeter is Rectangle and its perimeter" + perimetera);
		}
}
}
