package objectorientedprogram;
public class CatStart implements Comparable <CatStart> {

	private int age;
	private int sleep;

	public CatStart()
	{
	age = 1;
	sleep = 12;
	}

	public CatStart(int xAge, int xSleep)
	{ 
	age =xAge;
	sleep =xSleep; 
	}

	public int getAge()
	{
	return age;
	}

	public int getSleep()
	{
	return sleep;
	}

	public void setAge(int xAge)
	{
	age = xAge;
	}

	public void setSleep(int xSleep)
	{
	sleep = xSleep;
	}

	public void birthday()
	{
	age++;
	}

	public void sleepMore()
	{
	sleep++;
	}

	public void sleepless()
	{
	sleep--;
	}

	@Override
	public int compareTo(CatStart xperson) {
		if(Math.abs(age-xperson.getAge())<.0001) {
			return 0;
		}
		if(age<xperson.getAge()) {
			return -1;
		}
		return 1;
	}

}

