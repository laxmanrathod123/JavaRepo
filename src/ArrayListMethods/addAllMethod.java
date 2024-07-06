package ArrayListMethods;

import java.util.ArrayList;

public class addAllMethod {

	public static void main(String[] args) {
		ArrayList <String>ar1= new ArrayList<String>(9);
		ar1.add("java");
		ar1.add("python");
		ar1.add("rubby");
		ar1.add("java script");
		System.out.println(ar1);
		String str=ar1.get(0);
		System.out.println(str);
		System.out.println("Length of the string :"+str.length());
		System.out.println("Index of :"+str.indexOf("j"));
		
		ar1.trimToSize();
		System.out.println("After trim to size");
		System.out.println(ar1);
		
		ArrayList <String>ar2= new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Devops");
		System.out.println("----");
		
		ar1.addAll(ar2);
		System.out.println("after adding the collection");
		System.out.println(ar1);
		
		System.out.println("we can add the collection after what index we want");
		ar1.addAll(2, ar2);
		System.out.println("----");
		System.out.println(ar1);
		

	}

}
