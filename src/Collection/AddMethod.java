package Collection;

import java.util.ArrayList;

public class AddMethod {
	public void IntergerArray() {
		 ArrayList <Integer>arr= new ArrayList<Integer>();  //<Interger> This is the type of ArrayList
		 arr.add(12345679);
		 System.out.println("arr :"+arr);
		 
	 }
	public void StringArray() {
		 ArrayList <String>str= new ArrayList<String>();
		 str.add("piru");
		 System.out.println("str: "+str);
		 
	 }
	public void characterArray() {
		 ArrayList <Character>chr= new ArrayList<Character>();
		 chr.add('l');
		 System.out.println("chr: "+chr);
		 
	 }
 public static void main (String[]args) {
	 
	 AddMethod obj = new AddMethod();
	 obj.IntergerArray();
	 obj.StringArray();
	 obj.characterArray();
	 
	 ArrayList <Object> arr1= new ArrayList<Object>();
	 arr1.add("Laxman"); // String
	 arr1.add(12345);    // integer 
	 arr1.add('b');
	
	 System.out.println( "index: "+arr1.get(0)); // get method is used to print the object by using index
	 System.out.println("arr1: "+arr1);
	 
	 
 }
}
