import java.util.ArrayList;
import java.util.Arrays;

public class PrintOddNumberUsingArrayList {
	
	
	public static void main(String[] args) {
		// Print even and odd nubmer
		
		
		ArrayList<Integer> ar= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		ar.removeIf(num -> num%2!=0);
		System.out.println("Even number are :" + ar);
		
		ArrayList<Integer>number= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		number.removeIf(num -> num % 2==0);
		System.out.println("odd number are :" + number);
		
				
	}

}
