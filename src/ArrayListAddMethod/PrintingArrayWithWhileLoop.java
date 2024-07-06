package ArrayListAddMethod;

import java.util.ArrayList;

public class PrintingArrayWithWhileLoop {
	
	public static void main(String[]args)
	{
		
		ArrayList <Object> arr= new ArrayList <Object>();
		arr.add("Laxman");
		arr.add("Rathod");
		arr.add("pune");
		arr.add("mumbai");
		arr.add(124563);
		arr.add('L');
		arr.add(12.5f);
		arr.add(10);
		System.out.println("size of the Array:"+arr.size());
	    System.out.println("Printing arralist using while loop");
	    
	    int num=0;
	    
	    while(num<arr.size()) {
	    	
	    	System.out.println("Element at index " + num + " : " + arr.get(num));
	    	num++;
	    }
	}

}
