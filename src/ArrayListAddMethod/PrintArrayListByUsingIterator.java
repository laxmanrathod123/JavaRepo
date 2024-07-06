package ArrayListAddMethod;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayListByUsingIterator {

	public static void main(String[] args) {
		ArrayList <String>arr1= new ArrayList<String>();
		arr1.add("pune");
		arr1.add("Ajay");  
		arr1.add("Atul");  
		arr1.add("Rahul");
		arr1.add("Rajesh");
		arr1.add("40000");
		arr1.add("pune");      // Dublicate object is allowed 
		arr1.add("pune");      // Dublicate null values are also allowed
		arr1.add("pune");
		arr1.add(null);
		arr1.add(null);
		arr1.add(null);
		
		System.out.println(" printing the value by using iterator");
		Iterator<String> it=arr1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(" printing the value by using lambda expression");
		arr1.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println(" printing the value by using for loop");
		for (int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		
		System.out.println(" printing the value by using for each loop");
		
		for(String s: arr1) {
			System.out.println(s);
		}
		
		
		System.out.println("print the value by using while loop");
		System.out.println("Size of the array List : "+ arr1.size());
		int num=0;
		
		while(num<arr1.size()) {
			System.out.println(" Element at Index " + num + " : " + arr1.get(num));
			num++;
		}
	}

}
