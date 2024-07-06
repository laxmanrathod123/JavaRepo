package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsSortMethod {

	public static void main(String[] args) {
	ArrayList <Integer> number= new ArrayList <Integer>(Arrays.asList(11,55,88,99,44,77,66,44));
       System.out.println(number);
       
       Collections.sort(number);  // It will ararange the element in the acesding oreder
       System.out.println("After sorting the collection");
       
       System.out.println(number);
	}

}
