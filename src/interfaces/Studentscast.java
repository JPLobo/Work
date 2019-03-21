package interfaces;
import java.util.ArrayList;
public class Studentscast {
	public static void main(String[] args) {
	Teacher adult2 = new Teacher();
    Student kid2 = new Student();
    ArrayList<Person>peep = new ArrayList<Person>();
    peep.add(kid2);
    peep.add(kid2);
    peep.add(adult2);
    peep.add(adult2);
	for (Person someone : peep) {
		if ( someone instanceof Student) {
			Student kid = (Student) someone; 
			kid.outSick();
		}
		}
	for (Person someone : peep) {
		if (someone instanceof Teacher) {
			Teacher Adult = (Teacher) someone;
			Adult.payMe();
		}
		if (someone instanceof Student) {
			System.out.println(someone.getName());
		}
	}
	
}
}