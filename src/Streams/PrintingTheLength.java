package Streams;

import java.util.ArrayList;

public class PrintingTheLength {
	
	public static void main(String[]args) {
		
		ArrayList<String>names= new ArrayList<String>();
		names.add("Abhijit");
		names.add("Don");
		names.add("Alekhya");
		names.add("Addam");
		names.add("Ram");
		
		// This give all the result which length is greater than 4
		//names.stream().filter(ele->ele.length()>4).forEach(ele->System.out.println(ele));
		
		// This will give only one result which is first cause we give the limit size as one
		//names.stream().filter(ele->ele.length()>4).limit(1).forEach(ele->System.out.println(ele));
		
		names.stream().filter(ele ->ele.length()>4).sorted().map(ele ->ele.toUpperCase()).
		filter(ele-> ele.startsWith("A")).forEach(ele -> System.out.println(ele));
	}

}
