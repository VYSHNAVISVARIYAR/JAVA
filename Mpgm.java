import java.io.*;
import java.util.*;

interface test
{
	double calc_area(double a,double b);
	double calc_perimeter(double a,double b);
}

class circle implements test
{
	public double calc_area(double pi,double r)
	{
		
		return pi*(r*r);
	}
	public double calc_perimeter(double pi,double r)
	{
	
		return 2*pi*r;
	
	}

}
class rectangle implements test
{
	
	public double calc_area(double a,double b)
	{
		return a*b;
		
	}
	public double calc_perimeter(double a,double b)
	{
		
		return 2*(a+b);
	
	}

}
class Mpgm
{
	public static void main(String[] ar)
	{
	
		double rad,l,b;
		double pi = 3.14;
		test c= new circle();//test class only taken for reference can make circle/rectangle classes also
		test r=new rectangle();
		int c1,ch;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n1.Circle\n2.Rectangle\n3.Exit\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("\nEnter the radius:");
					rad=sc.nextDouble();
					System.out.println("\nArea of circle : "+c.calc_area(pi,rad)+"\nPerimeter of circle : "+c.calc_perimeter(pi,rad)+"\n");
					break;
				
				case 2:System.out.println("\nEnter the length:");
					l=sc.nextDouble();
					System.out.println("\nEnter the breadth:");
					b=sc.nextDouble();
					System.out.println("\nArea of rectangle : "+r.calc_area(l,b)+"\nPerimeter of rectangle : "+r.calc_perimeter(l,b)+"\n");
					break;
				
				case 3: return;
			
				default:System.out.println("\nInvalid Input\n");
			}
			
		}
	
	}
}
