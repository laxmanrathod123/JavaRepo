package SortedSetCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<>();
		  hs.add("Delhi");
		  hs.add("New York");
		  hs.add("Paris");
		  hs.add("London");
		  hs.add("Delhi"); // Adding duplicate elements.
		  
		  TreeSet<String> ts = new TreeSet<>(hs);
		  System.out.println("Sorted TreeSet: " +ts);
		  
		// Using methods of SortedSet interface.
		  System.out.println("First Element: " +ts.first());
		  System.out.println("Last Element: " +ts.last());
		  System.out.println("HeadSet Elements: " +ts.headSet("London"));
		  System.out.println("TailSet Elements: " +ts.tailSet("London"));
		  
		  SortedSet<String> subSet = ts.subSet("Delhi", "Paris");
		  System.out.println("SubSet Elements: " +subSet);
		  System.out.println("Sorted Set: " +ts.comparator()); // It will return null because natural ordering is used.
	}

}
