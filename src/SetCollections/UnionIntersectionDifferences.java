package SetCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifferences {

	public static void main(String[] args) {
		
		Set <Integer> first= new HashSet <Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));
		
		Set <Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,7,9}));
		
		Set <Integer> union= new HashSet <Integer>(first);
		union.addAll(second);
		 System.out.println("union :"+ union);
		

	}

}
