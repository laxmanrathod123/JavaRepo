package IntervierUniqueQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUniqueNumber {
	public static void main(String[] args) {
		// Print the unique value and after priting get me the the third index
		ArrayList<Integer>ar= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9,9,4,1,3,4));
		
		//ar.stream().distinct().forEach(ele -> System.out.println(ele));
		List<Integer>li=ar.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		

}
}
