package com.Day1;

public class Methods {

	// constructer
	public Methods() {
		this('A',10);
		System.out.println("Hello I am constructer");
	}

	public Methods(char a) {

		System.out.println("Hello I am constructer:: " + a);
	}
	public Methods(char a,int b) {

		System.out.println("Hello I am constructer:: " + a +" "+b);
	}

	// instance methods
	public void addition() {
		// multification();
		int a = 20;
		int b = 30;
		int c = a + b;
		System.out.println(c);
	}

	// instance methods
	public void test() {
		addition();
	}

	// Static method
	public static void multification() {
		// Name les
		Methods t = new Methods();
		t.addition();
		int a = 20;
		int b = 30;
		int c = a * b;
		System.out.println(c);
	}
	
	//instance blocks
	{
		
		System.out.println("this is instance blocks");
	}
	//static block
	static {
		System.out.println("Hello I am Static blocks");
	}

	public static void main(String[] args) {
		
		// object
				// ClassName refvar=new ClassName();
				Methods m = new Methods();

				new Methods();
				new Methods();
				new Methods();

				// m.addition();

				// ClassName.methodName();
				// Methods.multification();
				// m.multification();
	}

}
