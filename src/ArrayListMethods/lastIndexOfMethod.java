package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class lastIndexOfMethod {

	public static void main(String[] args) {
		ArrayList <String>ar= new ArrayList<String>(Arrays.asList("Naveen",
				"Automation","Testing","java"));
		
		System.out.println(ar);
		
		int index=ar.lastIndexOf("java");
		System.out.println("index of java:"+index);

	}

}
