package ArrayListAddMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class NaveenAutomationExample {
	public static void main(String []args)
	{
		
		ArrayList <String>names= new ArrayList<String>(Arrays.asList("laxman",
		"Rathod","Pune","mumbai","java"));
		
		System.out.println(names);
		System.out.println();
		names.add(0, "I am ");
		System.out.println(names);
		System.out.println();
		
		names.remove("I am ");
		System.out.println("Printing the value by using lambda");
		names.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("Printing the value by using iterator");
		Iterator <String> it=names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
