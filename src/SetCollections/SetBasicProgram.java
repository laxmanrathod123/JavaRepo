package SetCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetBasicProgram {
	
	public static void main (String []args) {
		// set is only allowed unique value
		// Its not store the dublicate value 
		// indexing is not present in the set
		// we can not use for loop becuase indexing is not present in the set 
		Set <String> st= new HashSet<String> ();
		st.add(null);
		st.add("Alpha");
		st.add("Testing");
		st.add("Beta");
		st.add("Beta");
		st.add("Beta");
		st.add(null);
		System.out.println(st);
		
		System.out.println("*********************");
		
		// printing way of set 
		 Iterator <String>itr=st.iterator();
		 while( itr.hasNext()) {
			System.out.println(itr.next());
		 }
		 
		 System.out.println("*********************");
		 
		 for(String s : st) {
			 System.out.println(s);
		 }
		 
		 System.out.println("******** Lambda expression ***********");
		 st.stream().forEach(ele -> System.out.println(ele));
		 
	}
	

}
