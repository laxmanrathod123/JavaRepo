package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class retainAllMethod {

	public static void main(String[] args) {
		ArrayList <String>Names= new ArrayList<String>(Arrays.asList("Naveen",
				"Automation","Testing","java","java"));
		
		System.out.println(Names);
		
		Names.retainAll(Collections.singleton("java"));
		System.out.println(Names);

	}

}
