class Parent 
{
System.out.println("parent class ins block!");
	}
	Parent()
	{
		System.out.println("parent class  0 arg cons");
	}
	static
	{
		System.out.println("parent class static  block!");
	}
	class Child extends Parent
	{
		System.out.println("child class ins block!");
	}
	Child()
	{
		System.out.println("parent class 0 -arg!");
	}
	static
	{
		System.out.println("parent class static block!");
	}
	public static void main(String[] args) 
	{
		new Child();
		new Child();
	}
}
