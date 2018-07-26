package oops;

public class Parent {
	
	int a=10;//instance variables
	
	int b=34;
	
	
	static String val="Testing";//static variables
	
	
	//instance method
	public void m1()
	{
		System.out.println("Parent m1 Method");
	}
	
	//static methods
	public static  void m2()
	{
		System.out.println("Parent m2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object
		Parent p=new Parent();
		p.m1();
		
		Parent.m2();
		
		System.out.println(p.a);
		
		System.out.println(val);
		

	}

}
