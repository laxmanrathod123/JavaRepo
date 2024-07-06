package Streams;

import java.util.stream.Stream;

public class PrintTwoArrayListUsingStream {

	public static void main(String[] args) {

		Stream strname=Stream.of("man","Don","Women");
		
		Stream strname2=Stream.of("java","sql","automatin");
		
		Stream newstream=Stream.concat(strname, strname2);
		//long l=newstream.count();
		//System.out.println(l);
		
		//System.out.println();
		
		//newstream.sorted().forEach(ele-> System.out.println(ele));
		
		boolean flag=newstream.anyMatch(ele -> ele.equals("java"));
		System.out.println(flag);

	}

}
