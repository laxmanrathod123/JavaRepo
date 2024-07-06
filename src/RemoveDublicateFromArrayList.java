import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDublicateFromArrayList {

	public static void main(String[] args) {

		// Remo
		
		ArrayList<Integer> ar= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,8,7,4,5,6,1,3,4,6,8));
		System.out.println("List with without dublicate :"+ar);
		LinkedHashSet<Integer>lh= new LinkedHashSet<Integer>(ar);
		System.out.println("List with removing dublicate :"+lh);
	}

}
