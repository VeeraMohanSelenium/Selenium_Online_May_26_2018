package oops;

public class Child extends Parent{

	
	public void test()
	{
		System.out.println("Child test method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c=new Child();
		c.m1();
		c.test();
		
		Child.m2();
		
		System.out.println(c.a);
		
		System.out.println(val);

	}

}
