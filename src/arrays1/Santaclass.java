package arrays1;

public class Santaclass {
private int age;
private String name;
private boolean record;
private boolean ay;



public void fortnite(int agex, String namex, boolean recordx) {
	age = agex;
	name = namex;
	record = recordx;
	ay = false;
}


public String getname() {
return name;	
	
}
public boolean employable() {
	if (age>= 50 && age<=70) {
		if(record == false) {
			ay =  true;
			return true;
		}
		
	}
	return false;
	
	
}


}