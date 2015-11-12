/*
Name: Susmitha Muraleedharan Nair
Class: SE - B
Roll no.: 18   

Experiment No.: 
Aim: interface Area
{
	final static double pi=3.14;
	double compute();
}
interface Volume
{
	public void compute();
}
Implement the required interfaces in Circle class and Sphere class.
*/
import java.util.*;
interface Area
{
	final static double pi=3.14;
	public void compute();
}
interface Volume
{
	public void compute();
}
class Circle implements Area
{
	double r;
	Circle(double rad)
	{
		r=rad;
	}
	public void compute()
	{
		System.out.println("Area of circle= "+(pi*r*r));
	}
}
class Sphere implements Area,Volume
{
	double r;
	public void compute()
	{
		System.out.println("Area of Sphere= " +(4.0*pi*r*r));
		System.out.println("Volume of Sphere= "+(4.0/3.0*pi*r));
	}
}
class ShapesDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle(4);
		System.out.println("Radius of Circle= "+c.r);
		c.compute();
		Sphere s=new Sphere();
		System.out.println("Enter the radius of Sphere: ");
		s.r=sc.nextDouble();
		s.compute();
	}
}
/*Output:
Radius of Circle= 4.0
Area of circle= 50.24
Enter the radius of Sphere:
5
Area of Sphere= 314.0
Volume of Sphere= 20.933333333333334
*/
