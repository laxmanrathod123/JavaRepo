package ArrayListAddMethod;

import java.util.ArrayList;

public class RetainAllMethod {

	public static void main(String[] args) {
		ArrayList <String> arr1= new ArrayList<String>();
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

		
		for (String s: arr1) {
			System.out.println(s);
		}
		
		System.out.println("*********************************");
		ArrayList <String> arr2= new ArrayList<String>();
		arr2.add("pune");
		arr2.add("Ajay");  
		arr2.add("Atul");  
		arr2.add("Rahul");
		for (String s: arr2) {
			System.out.println(s);
		}
		
		arr1.retainAll(arr2);
		
		System.out.println("arr1: "+arr1);
		System.out.println("*********************************");
		System.out.println("arr2: "+arr2);
		
		

	}

}
