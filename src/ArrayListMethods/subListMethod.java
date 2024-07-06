package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class subListMethod {

	public static void main(String[] args) {

		ArrayList <Integer> nubmers=new ArrayList <Integer>
		(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		
		System.out.println(nubmers);
		
		ArrayList<Integer> sublist=new ArrayList<Integer>(nubmers.subList(2, 6));
		System.out.println(sublist);

	}

}
