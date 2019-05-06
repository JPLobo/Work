package inheritance;
import java.util.ArrayList;
public class PrintingFactory
{

private Machine[] machines;

private ArrayList<PaperRoll> newRolls = new ArrayList<PaperRoll>();

private ArrayList<PaperRoll> usedRolls = new ArrayList<PaperRoll>();
public PrintingFactory(int numMachines) 
{ machines= new Machine[numMachines]; }

public void replacePaperRolls(PaperRoll roll)
{
	for (int i =0; i < machines.length; i++) {
		if (machines[i].getPaperRoll().getMeters() - 4.0 < .000001) {
			 PaperRoll g = new PaperRoll();
			 g = machines[i].getPaperRoll();
			 usedRolls.add(g);
			 newRolls.remove(g);
		}
	}
}
public double getPaperUsed()
{ 
	double counter =0;
	for (int h =0; h< machines.length; h++) {
		counter = counter +  (1000 - machines[h].getPaperRoll().getMeters());
	}
	for (int j =0; j<usedRolls.size(); j++) {
		counter = counter + (1000 - usedRolls.get(j).getMeters());
	}
	return counter;
}
}