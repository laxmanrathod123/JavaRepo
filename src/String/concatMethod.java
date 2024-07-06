package String;

public class concatMethod {

	public static void main(String[] args) {

		
		String a= "Javatraining"; 
		System.out.println(a.charAt(1));
		System.out.println(a.indexOf("e")); 
// if the character is not present in the string then it will return -1
		
		System.out.println(a.substring(4));  // 
		System.out.println(a.substring(1, 5));  // it will consider character from 1 to 4 and remove that one
		
		String conc=a.concat(" By Rahul Shetty");
		System.out.println(conc);
		System.out.println();
		System.out.println(a.concat(" By Rahul Shetty"));
		
		
	}

}
