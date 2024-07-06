package ArrayListAddMethod;

import java.util.ArrayList;

public class DublicateObjectAndNullValue {

	public static void main(String[] args) {
		ArrayList <String> arr= new ArrayList<String>();
		arr.add("pune");
		arr.add("Ajay");  
		arr.add("Atul");  
		arr.add("Rahul");
		arr.add("Rajesh");
		arr.add("40000");
		arr.add("pune");      // Dublicate object is allowed 
		arr.add("pune");      // Dublicate null values are also allowed
		arr.add("pune");
		arr.add(null);
		arr.add(null);
		arr.add(null);
		for(int i=0 ; i<arr.size(); i++) {
			System.out.println("Indexing of element " + i + " :"+ arr.get(i));
		}
		arr.remove("pune");
		System.out.println();
		System.out.println("after removing the pune from the list");
		
		for(int i=0 ; i<arr.size(); i++) {
			System.out.println("Indexing of element " + i + " : " + arr.get(i));
		}
	
		System.out.println();
		
		boolean flag=arr.contains("pune");  // contain method check object present or not
		System.out.println("object pune present in array list:"+flag);
		
		System.out.println();
		System.out.println("Printing the list using for each loop");
		for (String s: arr) {
			System.out.println(s);
		}
		arr.remove("pune"); // remove method remove the object present in the collection
		arr.remove(2);
		System.out.println(arr);
		System.out.println("******************************");
		System.out.println();
		ArrayList <String> arr2= new ArrayList<String>();
		arr2.add("pune");
		arr2.add("Ajay");  
		arr2.add("Atul");  
		arr2.add("Rahul");
		boolean flag1=arr.containsAll(arr2); // check the collection present in arr or not 
		System.out.println("arr2 is present in collection arr :"+flag1);
		for (String s1: arr2) {
			System.out.println(s1);
		}
		
		// To remove the array list
		
		arr.removeAll(arr2);
		System.out.println("******************************");
		for (String s: arr) {
			System.out.println(s);
		}
		System.out.println("******************************");
		for (String s1: arr2) {
			System.out.println(s1);
		}
		
	}

}
