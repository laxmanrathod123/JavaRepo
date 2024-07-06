package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveTheDublicate {

	public static void main(String[] args) {
		ArrayList <Integer>number=new ArrayList<Integer>(Arrays.asList(1,2,3,
				4,5,6,7,2,1,5,6,7,8,9));
		System.out.println("Without Removing : "+ number);
		LinkedHashSet<Integer> linkedHasSet= new LinkedHashSet<Integer>(number);
		System.out.println("after removing dublicate :"+linkedHasSet);
		ArrayList <Integer>numberListWithoutDublicate=new ArrayList<Integer>(linkedHasSet);
		System.out.println("numberListWithoutDublicate :"+numberListWithoutDublicate);
		

		System.out.println("**************");
		// jdk 8 stream 
		ArrayList <Integer>marks=new ArrayList<Integer>(Arrays.asList(1,2,3,
				4,5,6,7,2,1,5,6,7,8,9));
		
		List<Integer>MarkListUnique=marks.stream().distinct().collect(Collectors.toList());
		System.out.println("MarkListUnique"+MarkListUnique);
		
		
		
		
		
		
	}

}
