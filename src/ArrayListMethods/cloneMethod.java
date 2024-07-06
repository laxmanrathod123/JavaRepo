package ArrayListMethods;

import java.util.ArrayList;

public class cloneMethod {

	public static void main(String[] args) {
		ArrayList <String>ar1= new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("rubby");
		ar1.add("java script");
		System.out.println(ar1);
		System.out.println("----");
		
		ArrayList <String>cloneList=(ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
	
	}

}
