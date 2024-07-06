package Streams;

import java.util.stream.Stream;

public class StramFilter2 {
	
	
	public static void main (String[]args) {
		
			long l= Stream.of("Abhijit","Don","Alekhya","Ram").filter(ele->
			{
				ele.startsWith("A");
				return true;
			}).count();
			System.out.println(l);
			
	
		} 

}
