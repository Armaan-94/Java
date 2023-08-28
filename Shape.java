package Interfaces;

abstract class Shape
{
	int len,bred,side,r;
	abstract void RectangleArea(int len, int bred);
	abstract void SquareArea(int side);
	abstract void CircleArea(int r);
}
class Area extends Shape
{
	void RectangleArea(int len, int bred)
	{
	this.len=len;
	this.bred=bred;
	System.out.println("Area of rectangle is " +(len*bred));
	}
	void SquareArea(int side)
	{
	this.side=side;
	System.out.println("Area of square is " +(side*side));
	}
	void CircleArea(int r)
	{
	this.r=r;
	System.out.println("Area of circle is " +(3.14*r*r));
	}
}
class Demo
{
	public static void main(String args[])
	{
	Area ob=new Area();
	ob.RectangleArea(2,3);
	ob.SquareArea(4);
	ob.CircleArea(3);
	}
}
