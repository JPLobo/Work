package arrays1;

import java.util.ArrayList;

public class Family {
	private ArrayList<Person> adults = new ArrayList<Person>();
	private ArrayList<Person> kids = new ArrayList<Person>();

	public void add(Person x) {
		if (x.getAge() <= 18) {
			kids.add(x);
		} else {
			adults.add(x);
		}
	}

	public boolean isInFamily(Person y) {
		for (int n = 0; n < adults.size(); n++) {
			if (y == (adults.get(n))) {
				return true;
			}
		}

		for (int j = 0; j < kids.size(); j++) {
			if (y == (kids.get(j))) {
				return true;
			}
				

		}
		return false;
	}

}
