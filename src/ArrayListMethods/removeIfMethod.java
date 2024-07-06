package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethod {

	public static void main(String[] args) {
		
      ArrayList <Integer>number= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
       number.removeIf(num -> num%2 ==0);
       System.out.println(number);
	}

}
