package com.Day2;

public class Arrays {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//Data Types
//		//2types
//		//1. Primitive
//		
//		int x=10;
//		char c='A';
//		
//		//2. non primitive 
//		
//		//String[]
//		//only string values
//						//0			//1		//2		//3	//4
//		String[] str={"Testing","Masters","Hyd","India","2"};
//		
////		System.out.println(str[4]);
////		System.out.println(str[1]);
//		
//		int size=str.length;
//		System.out.println(size);
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(str[i]);
//		}
//		
//		
//		
//		
//		//int[]
//		//only numeric values
//		
//		int[] in={1,2,3,4,5,6,7,8};
//		int s=in.length;
//		for(int i:in)
//		{
//			System.out.println(i);
//		}
//		
//		
//		
//		
//		//Object[]
//		//Staring values and numeric values
//		
//		Object[] obj={"String",3,"Hello",6,7,"Testing"};
//		
//		int o=obj.length;
//		for(int j=0;j<o;j++)
//		{
//			System.out.println(obj[j]);
//			
//		}
//		
				
		//Single diementional array
		//Syntax
		
		//Note : enter the 
//		String[] val=new String[4];
//		val[0]="Hello";
//		val[1]="World";
//		val[2]="Hyd";
//		val[3]="India";
//		//val[4]="Us";
//		System.out.println(val.length);
//		
//		
//		val=new String[6];
//		System.out.println(val.length);
//		System.out.println(val[1]);
//		
//		int[] i=new int[3];
//		i[0]=1;
//		i[1]=3;
//		i[2]=5;
//		System.out.println(i.length);
//		System.out.println(i[2]);
//		
//		
//		Object[] ob=new Object[2];
//		ob[0]="Testing";
//		ob[1]=3;
//		System.out.println("Size of object array is:: "+ob.length);
		
		//Multi
		
		//Syntax;
		
		String[][] h=new String[3][3];
		h[0][0]="Hello";
		h[0][1]="World";
		h[0][2]="A";
		h[1][0]="B";
		h[1][1]="C";
		h[1][2]="D";
		h[2][0]="E";
		h[2][1]="F";
		h[2][2]="G";
		
		
		//System.out.println(h[1][2]);
		//row count
		int s=h.length;//instance variable
		for(int i=0;i<s;i++)
		{
			//each row of column count
			int d=h[i].length;//local variable
			for(int y=0;y<d;y++)
			{
				System.out.print(h[i][y]+" ");
			}
			System.out.println();
			
		}
		
		
		int[][] in=new int[2][2];
		in[0][0]=1;
		in[0][1]=2;
		in[1][0]=3;
		in[1][1]=4;
		
		System.out.println();
		int t=in.length;
		for(int i=0;i<t;i++)
		{
			//each row of column count
			int d=in[i].length;
			for(int y=0;y<d;y++)
			{
				System.out.print(in[i][y]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
