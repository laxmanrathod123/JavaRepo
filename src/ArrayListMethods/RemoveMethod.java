package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethod {

	public static void main(String[] args) {
		ArrayList <String>ar= new ArrayList<String>(Arrays.asList("Naveen",
				"Automation","Testing","java"));
		
		System.out.println(ar);
		ar.remove(0);
		System.out.println(ar);
	
		System.out.println("--");
		ar.remove("Automation");
		System.out.println(ar);
		

	}

}
