package interfaces;

public class Cat implements Animal {
private int age;
private String name;
private boolean friendly;

public void act() {
age =+ 9;
if (friendly == false) {
	friendly = true;
	}
else { 
	friendly = false;
}
}
public String toString() {
return "Cat" + age + name + friendly;
}
public boolean returnFriendly() {
	return friendly;
}
}