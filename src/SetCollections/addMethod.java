package SetCollections;

import java.util.HashSet;
import java.util.Iterator;



public class addMethod {

	public static void main(String[] args) {
		//HashSet <Integer> h1= new HashSet <Integer>(Arrays.asList(11,22,33,44,55));
		HashSet <Integer> h1= new HashSet <Integer>();
		h1.add(11);
		h1.add(22);
		h1.add(null);  // set does not allowed to store the dublicate object and null 
		h1.add(22);
		h1.add(33);
		h1.add(33);
		h1.add(55);
		h1.add(55);
		h1.add(44);
		h1.add(null);
		System.out.println("size of the set: " +h1.size());
		System.out.println("Object in set: "+h1);
		
		System.out.println(h1.isEmpty()); // isEmpty method check whether the set is empty or not
		
		System.out.println("******	");
		Iterator <Integer>itr=h1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		

	}

}
