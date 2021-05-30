class Test 
{
	Test()
	{
System.out.println("0-arg cons");
	}
	Test(int a)
	{
		System.out.println("1-arg cons");
	}
	Test(int a,int b)

	{
		System.out.println("2-arg cons");
	}
	public static void main(String[] args) 
	{
		Test t1 = new  Test();
        Test t2 = new  Test(10);
       Test t3 = new  Test(10,20);
	   new  Test();
	   new  Test(10);
	   new  Test(10,20);
							}
}
