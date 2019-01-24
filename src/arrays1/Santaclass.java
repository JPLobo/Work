package arrays1;

public class Santaclass {
private int age;
private String name;
private boolean record;




public void fortnite(int agex, String namex, boolean recordx) {
	age = agex;
	name = namex;
	record = recordx;

}


public String getname() {
return name;	
	
}
public boolean employable() {
	if (age>= 50 && age<=70) {
		if(record == false) {
			
			return true;
		}
		
	}
	return false;
	
	
}


}