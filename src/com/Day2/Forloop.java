package com.Day2;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=2;
		int x=20;
		//for(intial value;condition;increment or decrement)
		
		//Print the 2 table
		
		//2 +"X"+ 1 = 2
		
		for(int i=0;i<=x;i++)
		{
			//System.out.println(n+" X "+i+" = "+n*i);
		}

		for(int j=x;j>=0;j--)
		{
			//System.out.println(n+" X "+j+" = "+n*j);
		}
		
		int b=10;
		String[] a={"Testing","Masters"};
		System.out.println(a[0]);
		System.out.println(a[1]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		int[] s={2,4,5,6,7,8,9};
		//foreach
		
		//Basic syntax    for(Datatype vari:list or array variable)
		
		for (String c : a) {
			//System.out.println(c);
			
		}
		for (int i : s) {
			//System.out.println(i);
			
		}
		
	}

}
