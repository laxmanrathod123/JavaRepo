import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PrintingTheArrayListByAllWay {

	public static void main(String[] args) {

		ArrayList<String> ar= new ArrayList<String>();
		ar.add("pune");
		ar.add("Ajay");  
		ar.add("Atul");  
		ar.add("Rahul");
		ar.add("Rajesh");
		ar.add("40000");
		ar.add("pune");      // Dublicate object is allowed 
		ar.add("pune");      // Dublicate null values are also allowed
		ar.add("pune");
		ar.add(null);
		ar.add(null);
		ar.add(null);
		
		// Printing the ArrayList by using for lop
		System.out.println("Printing the arrayList by using for loop");
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// Printing the ArrayList by using while loop
		System.out.println();
		
		System.out.println("Printing the ArrayList by using while loop");
		
		int num=0;
		while(num<ar.size()) {
			
			System.out.println(ar.get(num));
			num++;
		}
		System.out.println();
		// printing the arrayList by using enhanced for each loop 
		System.out.println("printing the arrayList by using enhanced for each loop ");
		
		for(String str:ar) {
			System.out.println(str);
		}

		System.out.println();
	// Printing the arrayList list by using lambda expression
		System.out.println("Printing the arrayList list by using lambda expression");
		ar.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println();
		//Printing the arrayList by using Iterator
		System.out.println("Printing the arrayList by using Iterator");
		Iterator<String>itr=ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("Printing the ArrayList by using ListIterator");
		// Printing the ArrayList by using ListIterator
		
		ListIterator<String>ltrI=ar.listIterator();
		while(ltrI.hasNext()) {
			System.out.println(ltrI.next());
		}
		System.out.println("*******");
		System.out.println(ltrI.hasPrevious()); // its return type is boolean
		System.out.println(ltrI.previous());
		System.out.println(ltrI.previous());
		System.out.println(ltrI.previous());
		System.out.println(ltrI.previous());
		
		
		
	}

}
