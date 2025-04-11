package Graphics;
import Graphics.inter;
public class rectangle implements inter
{

	double l,b;
	public rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	
	}
	public double area()
	{
		return l*b;
	}
	

}



