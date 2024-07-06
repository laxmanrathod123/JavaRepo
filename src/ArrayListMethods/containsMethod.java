package ArrayListMethods;

import java.util.ArrayList;

public class containsMethod {

	public static void main(String[] args) {

		ArrayList <String>ar1= new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("rubby");
		ar1.add("java script");
		System.out.println(ar1);
		System.out.println("----");
		
		boolean flag=ar1.contains("java");
		System.out.println("java is present:"+flag);
		boolean flag1=ar1.contains("c");
		System.out.println("c is present:"+flag1);

	}

}
