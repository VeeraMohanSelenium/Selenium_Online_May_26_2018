package Overriding;

public class Runner {
	
	Runner(int a,String val)
	{
		System.out.println(" Parent Class World");
	}

	int a=20;
	static int c=89;
	
	public void animal()
	{
		System.out.println("This is parent animal method");
	}
	
	public void cat()
	{
		System.out.println("This is parent cat method");
	}
	public static void hyd()
	{
		System.out.println("This is parent hyd static method");
	}
	
	
	public void test()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
