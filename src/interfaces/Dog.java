package interfaces;

import java.util.Random;

public class Dog implements Animal {
	private String name;
	private int age;
	private boolean injured;

	public Dog() {
		name = "Gamer";
		age = 3;
		injured = false;

	}

public void act() {
	Random x = new Random ();
	int min = 1;
	int max = 50;
	int randomNum = min + x.nextInt(max-min + 1);
 age += 7;
if (randomNum == 1) {
	injured= true;
}
	}

	public String toString() {
		return "Dog" + age + name + injured;
	}

	public void vet() {
		injured = false;
	}

}