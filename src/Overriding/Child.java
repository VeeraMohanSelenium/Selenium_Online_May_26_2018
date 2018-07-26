package Overriding;

public class Child extends Runner {

	// The jvm will generate the one default constructor and their is no any
	// calling statement in side constructor it will be create one super() key
	// word.
	Child()
	{
		super(10,"Hello");
	}

	

	int a = 20;
	static int c = 89;

	public void animal() {
		System.out.println("This is Child animal method");
	}

	public void cat() {
		System.out.println("This is Child cat method");
	}

	public static void hyd() {
		System.out.println("This is Child hyd static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// Child class Object
//		Child c = new Child();
//		c.animal();
//		c.cat();
//		Child.hyd();
//
//		System.out.println();

		// //Parent Class Object
		// Runner r=new Runner();
		// r.animal();
		// r.cat();

		// Type casting

		Runner r = new Child();

		r.animal();// Instance method overriding is possible
		r.cat();
		Runner.hyd();// Static methods are overriding is not possible
		
		
		
		

	}

}
