package ArrayListAddMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) {

		ArrayList<String>ar= new ArrayList<String>(Arrays.asList("pune","mumbai","delhi","hydrabad"));
		ListIterator <String> itr=ar.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("*************");
		System.out.println(itr.hasPrevious());
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		System.out.println(itr.previous());
	}

}
