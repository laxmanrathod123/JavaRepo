package Java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Imperative_vs_Declarative_example {

	public static void main(String[] args) {

		List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,4,5,6,7,8,2);
		System.out.println(integerList);
		
		List<Integer> uniqueList= new ArrayList();
		for(Integer integer : integerList) {
		if(!uniqueList.contains(integer)) {
			uniqueList.add(integer);
		}
	
		}
		System.out.println(uniqueList);
		
		List<Integer>uniqueList1=integerList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList1);
	}

}
