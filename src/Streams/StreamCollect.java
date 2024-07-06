package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {

		
		List<String> ls= (List<String>) Stream.of("Abhijir","Rahul","Ramesh","Jagtap")
				.filter(s -> s.endsWith("r")).map(s ->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
	}

}
