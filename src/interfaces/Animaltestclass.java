package interfaces;

import java.util.ArrayList;

public class Animaltestclass {
	   public static void main(String[] args) {
		   ArrayList<Animal>lo = new ArrayList<Animal>();
		   lo.add(new Cat());
		   lo.add(new Cat());
		   lo.add(new Cat());
		   lo.add(new Dog());
		   lo.add(new Dog());
		   lo.add(new Dog());
		   for (int v =0; v<lo.size(); v++) {
			   lo.get(v).act();
			   System.out.println(lo.get(v).toString());
			   if (lo.get(v) instanceof Dog) {
				  Dog temp = (Dog)lo.get(v);
				  temp.vet();
			   }
			   }
		   for(int i =lo.size()-1; i>=0; i-- ) {
			   
			   if(lo.get(i) instanceof Cat) {
				   Cat Catty = (Cat)lo.get(i);
				   if(Catty.returnFriendly() == false) {
					   lo.remove(i);
					   break;
				   }
			   }
		   }
		   for (Animal pets : lo) {
			 System.out.println(pets.toString());
		   }
		   }
	   }

