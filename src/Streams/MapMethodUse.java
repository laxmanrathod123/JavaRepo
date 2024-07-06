package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapMethodUse {
	
	public static void main(String[]args) {
		
		
		  Stream.of("Abhijit","Don","Alekhya","Adam","Rama").
		  filter(ele->ele.endsWith("a")).map(ele->ele.toUpperCase()).
		  forEach(ele->System.out.println(ele));
		 
		  System.out.println();
		
		// In above we have apply the condition rather than this we can do with map
		Stream.of("Abhijit","Don","Alekhya","Adam","Rama").map(ele->ele.toUpperCase()).
		forEach(ele->System.out.println(ele));
		
		 System.out.println("****sorted List*****");
		 
		List<String>names=Arrays.asList("Abhijit","Don","Alekhya","Adam","Rama");
		names.stream().filter(ele->ele.startsWith("A")).sorted()
		.map(ele->ele.toUpperCase()).forEach(ele->System.out.println(ele));
	}

}
