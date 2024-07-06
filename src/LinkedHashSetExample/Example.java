package LinkedHashSetExample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Example {

	public static void main(String[] args) {

		//HashSet<Integer> hs= new HashSet<Integer>();
		LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		
		System.out.println(hs);
		System.out.println("Element at Index " + hs + " : " + hs);
		
		// Only the insertion order is present in the LinkedHashSet 
		// In what order we insert the same order we get the element
		
		
		
		
		
		
	}

}
