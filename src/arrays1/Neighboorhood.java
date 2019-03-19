package arrays1;

import java.util.ArrayList;

public class Neighboorhood {
	ArrayList<Family> families = new ArrayList<Family>();

	public void add(Family newFamily) {
		families.add(newFamily);
	}

	public boolean isinNeighborhood(Person person) {
		for (int o = 0; o < families.size(); o++) {
			if (families.get(o).isInFamily(person)) {
				return true;
			}

		}
		return false;
	}

}
