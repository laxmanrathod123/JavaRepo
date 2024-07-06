package ArrayListAddMethod;

import java.util.ArrayList;
// Add method and get method used in this
public class Ex1 {
	
	public static void main (String []args)
	{
		ArrayList <Object> arr= new ArrayList<Object>();
		arr.add("Laxman");
		arr.add("Rathod");
		arr.add("pune");
		arr.add("mumbai");
		arr.add(124563);
		arr.add('L');
		arr.add(12.5f);
		arr.add(10);
		//printing the size of the array 
		System.out.println("size of the Array:"+arr.size());
		System.out.println("arr:" + arr);
		System.out.println("*********Lambda expression*************");
		arr.stream().forEach(ele -> System.out.println(ele));
		
		// for loop its used when we want to perform the operation on indexing
		System.out.println("**********************");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
			
		}
		System.out.println("**********************");
		// for each loop
		for (Object obs : arr) {
			
			System.out.println(obs);
		}
		 
		System.out.println("Printing the array by using while loop");
		int num=0;
		while(arr.size()>num) {
		System.out.println(arr.get(num));
		num++;
		}
	}

}
