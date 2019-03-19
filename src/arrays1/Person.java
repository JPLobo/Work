package arrays1;

public class Person {
	private String name;
	private int age;
	public Person(String myName, int myAge)
	{
	name= myName;
	age= myAge;
	}
	public String getName()
	{ return name; }
	public int getAge()
	{ return age; }
	public boolean matches(Person p)
	{ 
	if (p.getAge() == age && p.getName() == name) {
		return true; }
	else { 
		return false;
	}
	}
	}

