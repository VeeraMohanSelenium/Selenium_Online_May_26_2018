package oops;

public class SubChild extends Child{
	
	public void m6()
	{
		System.out.println("Subchild method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubChild sub=new SubChild();
		sub.m1();
		sub.test();
		m2();
		
		System.out.println(sub.a);
		System.out.println(val);
		System.out.println(sub.b);
		sub.m6();
		
		Child c=new Child();
		c.m1();
		c.test();
		
		

	}

}
