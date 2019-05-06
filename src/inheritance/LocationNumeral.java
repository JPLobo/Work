package inheritance;

public class LocationNumeral
{

public int getLetterValue(String letter)
{
String letters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
return (int) Math.pow(2, letters.indexOf(letter));
}

public String getLetter(int value)
{ 
	String x = "return";
	return x;
}
	public int getDecimalValue(String numeral)
	{  
		int total =0;
		for (int i=0; i<numeral.length(); i++) {
			String letter = numeral.substring(i, i +1);
			total = total + getLetterValue(letter);
		}
		return total;
	}
	
	public String sortLocationNumeral(String numeral)
	{  
	 return numeral;
	}
	
	public String add(String num1, String num2)
	{ 
		String sum = num1+num2;
		boolean sim = false;
		while (!sim)  {
			sim = true;
			int i =0;
			sum = sortLocationNumeral(sum);
			while (i< sum.length() -1) 
			{
				String let =sum.substring(i,i + 1);
				if (let.equals(sum.substring(i+1, i+2)))
				{
					String b =sum.substring(0, i);
					String a =sum.substring(i + 2);
					String newlet = getLetter(2 * getLetterValue(let));
					sum = b + newlet + a;
					sim = false;
				} 
				else {
					i++;
				}
				sum = sortLocationNumeral(sum);
			}
		}
		return sum;
	}
	
				

}
