package Streams;

import java.util.ArrayList;

public class StreamExample {
	
	public static void main(String[]args) {
		
		ArrayList<String>names= new ArrayList<String>();
		names.add("Abhijit");
		names.add("Don");
		names.add("Alekhya");
		names.add("Addam");
		names.add("Ram");
		
	Long l=	names.stream().filter(ele->ele.startsWith("A")).count();
	System.out.println(l);
	//System.out.println("String present in the arrayList start with letter A is:"+l);
	
	// Lambda Expression for printing the array List
	
	System.out.println("***************************");
	
	names.stream().forEach(element ->System.out.println(element));
	}

}
