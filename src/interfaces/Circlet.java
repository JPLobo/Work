package interfaces;

public class Circlet
{
    private double radius;
    
    public Circlet()
    {
	radius = 10;
    }
    public Circlet(double r)
    {
         radius = r;
    }
    public double getRadius()
    {
	return radius;
    }
    public void setRadius(double r)
    {
	radius = r;
    }
    public double perimeter()
    {
        return (2.0*Math.PI*radius);
    }
    public double area()
    {
        return (Math.PI*(radius*radius));
    }
    
}
