package ArrayListAddMethod;

import java.util.ArrayList;

public class AddAndSetMethod {

	
	public void StringArrayList() {
		ArrayList <String> arr= new ArrayList<>();
		arr.add("Ajay");  //0
		arr.add("Atul");  //1
		arr.add("Rahul");
		arr.add("Rajesh");
		arr.add("40000");
		arr.add(1, "Birbal");  // add method is used to add the object
		arr.set(2, "Rakesh");   // set method is used to replace the object
		System.out.println("getting the value of interger: "+arr.get(5));
		int pincode=Integer.parseInt(arr.get(5));  // parseInt returen you int 
		System.out.println(pincode);
	
		int pincode1=Integer.valueOf(arr.get(5)).intValue(); // valueOf return you integer
		System.out.println(pincode1);
		 for (int i=0; i<arr.size(); i++) {
			 System.out.println(arr.get(i));
		 }
		
	}
	public static void main(String[] args) {
		AddAndSetMethod obj= new AddAndSetMethod();
		obj.StringArrayList();

	}

}
