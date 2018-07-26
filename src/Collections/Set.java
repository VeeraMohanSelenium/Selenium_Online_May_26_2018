package Collections;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Basic syntax of set
		java.util.Set<String> val=new HashSet<>();
		
		//add the values into set by using add method
		val.add("Testing");
		val.add("Testing");
		val.add("Hello");
		val.add("World");
		
		
		//find the size of set using size() method
		int size=val.size();
		System.out.println(size);
		//u can't get the values by using index based
		
		//iterate the values by using foreach loop
		for(String str:val)
		{
			System.out.println(str);
		}
		
		

	}

}
