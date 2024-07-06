package StringLogic;

public class ReverseString {

	public static void main(String[] args) {

		//String str="madam"; 
		String str="laxman";
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			//System.out.println(str.charAt(i));
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("given string is palindrome string");
		}else {
			System.out.println("given string is not palindrome string");
		}
	}

}
