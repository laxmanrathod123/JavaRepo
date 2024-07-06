package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class toArrayMethod {

	public static void main(String[] args) {
		ArrayList <String>newList= new ArrayList<String>(Arrays.asList("Naveen",
				"Automation","Testing","java","java"));
		
		System.out.println(newList);
		System.out.println("------");
		Object []ar=newList.toArray();
	     for(Object o: ar) {
	    	 System.out.println((String)o);  // if we remove the string then it will give you array
	    	
	    	 
// toArray Method return you the single diamention array	    	 
	     }

	}

}
