package String;

public class splitMethod {
	// To Remove the white spaces present int the given string
	
	public static void main (String[]args) {
		String str= "Java/training";
		//System.out.println(str);
		String ar[]=str.split("t");
		String ar1[]=str.split("/");
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		
		
		
	}

}
