 package ArrayListAddMethod;

import java.util.ArrayList;

public class LambdaExpressionforPrintingArrayList {

	public static void main(String[] args) {
		ArrayList <String> studentList= new ArrayList<String>();
		studentList.add("Tom");	
		studentList.add("Naveen");	
		studentList.add("Steve");	
		studentList.add("Lisa");	
		
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
       System.out.println("------");
		for (String s: studentList) {
			System.out.println(s);
		}
		  System.out.println("------");
		  studentList.stream().forEach(ele ->System.out.println(ele));
	}

}
