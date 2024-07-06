package RahulShettyColllectionProgram;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[]args) {
		
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Rahul");
		ar.add("java");
		System.out.println(ar);
		ar.add(0, "Student");
		System.out.println(ar);
	}

}
