package ArrayListMethods;

import java.util.ArrayList;

public class defaultCapacity {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // Here, list can hold 10 elements.(Default initial capacity).
		  list.ensureCapacity(20); // Now it can hold 20 elements.
		  list.trimToSize();
		  list.add("java");
		 
		  System.out.println(list);
	}

}
