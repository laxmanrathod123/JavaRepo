package ArrayListMethods;

import java.util.ArrayList;

public class indexOfMethod {
	public static void main(String[] args) {
		ArrayList <String>ar1= new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("rubby");
		ar1.add("java script");
		System.out.println(ar1);
		
		System.out.println(ar1.indexOf("rubby")>0);  // This return boolean true or false
		System.out.println(ar1.indexOf("java")); // return the index of the object
	
	}

}
