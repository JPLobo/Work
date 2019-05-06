package inheritance;

public class Machine
{
private PaperRoll paper;
public Machine(PaperRoll roll)
{ paper= roll; }
public PaperRoll getPaperRoll()
{ return paper; }

public PaperRoll replacePaper(PaperRoll pRoll)
{
PaperRoll x = new PaperRoll();
x = paper;
paper = pRoll;
return x;
}

}