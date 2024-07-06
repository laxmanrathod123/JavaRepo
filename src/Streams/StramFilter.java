package Streams;

import java.util.stream.Stream;

public class StramFilter {
	
	public void streamfilter()
	{
		Long l=Stream.of("Abhijit","Don","Alekhya","Adam","Ram")
		.filter(ele->ele.startsWith("A")).count();
		System.out.println(l);
		
		
		
	}
	public static void main (String[]args) {
		StramFilter stm= new StramFilter();
		stm.streamfilter();
	}

}
