package com.Day2;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 20;
		// if condition
		if (a == b) {
			// System.out.println("A and b is equal");
		}

		// if-else

		// if(a==b)
		// {
		// System.out.println("a and b is equal");
		// }
		// else
		// {
		// System.out.println("A and B is Not equal");
		// }

		// if-else-if
		/*
		 * if(conditon) {
		 * 
		 * } else if(condition) {
		 * 
		 * } else if(Condition) {
		 * 
		 * } else {
		 * 
		 * }
		 */

		if (a == b) {
			System.out.println("a and b is equal");
		} else if (a > b) {
			System.out.println("A is greater then b");
		} else if (a < b) {
			System.out.println("A is less then b");
		} else {
			System.out.println("A and b are not equal");
		}

		// Switch

		String browser = "ted";
		// Sysntax:
		// switch (key) {
		// case value:
		//
		// break;
		//
		// default:
		// break;
		// }

		switch (browser) {
		case "ie":
			System.out.println("Launch ie browser");
			break;
		case "chrome":
			System.out.println("Launch chrome browser");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		default:
			System.out.println("User input is not match any condition");
			break;

		}
		
		//nested if
//		if(condition)
//		{
//			if(condition)
//			{
//				
//			}
//			else
//			{
//				
//			}
//		}
		
		
		boolean status=false;
		
		if(status)
		{
			boolean ast=true;
			if(ast)
			{
				System.out.println(ast);
			}
			else
			{
				System.out.println(ast);
			}
			
			
		}
		else
		{
			System.out.println(status);
		}
		
		

	}

}
