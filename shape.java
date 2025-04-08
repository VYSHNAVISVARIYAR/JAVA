import java.util.Scanner;

interface Shape{
	
	public void area();
	public void perimeter();
}
class circle implements Shape{
	Scanner sc = new Scanner(System.in);
	double r;
	public void area()
	{
		double circlearea = 3.14*r*r;
		System.out.println("The area of the circle is :"+circlearea);
	}
	public void perimeter(){
		double circleperimeter = 2*3.14*r;
		System.out.println("The perimeter of the circle is :"+circleperimeter);
		}
}

class rectangle implements Shape{
	int l,b;
	
	public void area()
	{
		int rectarea = l*b;
		System.out.println("The area of the rectangle is :"+rectarea);
	}
	public void perimeter(){
		int rectperimeter = 2*(l+b);
		System.out.println("The perimeter of the rectangle is :"+rectperimeter);
	}
}

public class shape{
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		double r = sc.nextDouble();
		System.out.println("Enter the length of the rectangle :");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle :");
		int b = sc.nextInt();
	
	
		circle circle1 = new circle();
		rectangle rectangle1 = new rectangle();
		
		circle1.area();
		circle1.perimeter();
		rectangle1.area();
		rectangle1.perimeter();
		
	}

}
