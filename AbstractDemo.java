abstract class Shape
{
	float dim1,dim2;
	Shape(float d1,float d2)
	{
		dim1=d1;
		dim2=d2;
	}

	abstract double area();
	
	
}

class Rectangle extends Shape
{
	Rectangle(float d1,float d2)
	{
		super(d1,d2);
	}

	double area()
	{
		System.out.println("You r in Rectangle class");
		return dim1*dim2;
	}
}

class Triangle extends Shape
{
	Triangle(float d1,float d2)
	{
		super(d1,d2);
	}

	double area()
	{
		System.out.println("You r in Triangle class");
		return dim1*dim2/2;
	}
}

class AbstractDemo
{
	public static void main(String args[])
	{
		
		Rectangle r=new Rectangle(30,40);
		Triangle t=new Triangle(50,60);
		Shape sr;
		sr=r;
		System.out.println("Area:"+ sr.area());
		sr=t;
		System.out.println("Area:"+ sr.area());
	}
}