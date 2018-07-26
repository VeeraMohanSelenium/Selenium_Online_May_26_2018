package com.Day1;

public class Variables {
	int x = 20;// instance variables

	static int s = 30;// Static variables

	public static void main(String[] args) {

		int a = 10;// local variables

		// Object
		Variables v = new Variables();

		System.out.println(v.x);
		System.out.println(s);

	}

}
