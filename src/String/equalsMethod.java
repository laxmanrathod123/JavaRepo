package String;

public class equalsMethod {

	public static void main(String[] args) {

		String a= "Hellow";
		String b= "Hellow";
		System.out.println(a.equals(b));  // compare only the content present in the string
		System.out.println(a==b);         // compare the object of the string
		
		System.out.println();
		
		 
		String str= new String("Hellow");  // String class create new object in memory every time
		String str1= new String("Hellow");  // return true
		System.out.println(str.equals(str1)); 
		System.out.println(str==str1);
		
		System.out.println("***********");
		
		System.out.println(a.equals(str));
		System.out.println(a==str);
		
		
	}

}
