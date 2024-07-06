package TreeSetCollection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		
		   ts.add("India"); // ts.size() is 1.
		   ts.add("USA"); // ts.size() is 2.
		   ts.add("Australia"); // ts.size() is 3.
		   ts.add("New zealand"); // ts.size() is 4.
		   ts.add("Switzerland"); // ts.size() is 5.
		   
		   System.out.println("TreeSet is sort the elment in Ascending order ");
		   System.out.println("Sorted TreeSet :" + ts);
		   
		   // All method present in HashSet is applicable for TreeSet also
	}

}
