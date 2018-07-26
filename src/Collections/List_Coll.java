package Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> val = new ArrayList<String>();

		// Adding the value from the list add method
		val.add("Hello");// 0
		val.add("World");// 1
		val.add("Testing");// 2

		// Retrive the values from the list useing get method

		// System.out.println(val.get(2));

		// Size is find the size of list

		int size = val.size();// size 3
		System.out.println(size);
		//
		val.remove(1);

		size = val.size();// 2
		System.out.println(size);
		System.out.println(val.get(1));
		// add
		val.add(1, "World");
		System.out.println(val.get(1));
		// 0 1 2 3 4 5 6
		// 012345
		System.out.println();
		for (int i = 0; i <= size; i++) {
			System.out.println(val.get(i));
		}

	}

}
